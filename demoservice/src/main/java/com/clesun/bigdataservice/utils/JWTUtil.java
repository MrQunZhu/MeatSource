package com.clesun.bigdataservice.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * author: lixq
 * date: 2018/8/12
 * 描述:
 */
@Component
public class JWTUtil {
    private static Logger LOGGER = LoggerFactory.getLogger(JWTUtil.class);
    private static String SECRET_KEY;
    private static long TTLMILLIS;

    @Value("${jwt.secret_key}")
    private void setSecretKey(String secretKey) {
        JWTUtil.SECRET_KEY = secretKey;
    }
    @Value("${jwt.ttlMillis}")
    private void setTtlMillis(long ttlMillis) {
        JWTUtil.TTLMILLIS = ttlMillis;
    }

    /**
     * author lixq
     * date 2018/8/13
     * description 由字符串生成加密key
     * @param
     * @return
     */
    /*public static SecretKey generalKey(){
        byte[] encodedKey = Base64.decodeBase64(SECRET_KEY);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }*/

    /**
     * author lixq
     * date 2018/8/13
     * description 生成token
     * @param
     * @return
     */
    /*public static String buildJwt(){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256 ;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        SecretKey key = generalKey();
        JwtBuilder builder = Jwts.builder()
                .setIssuedAt(now)
                .signWith(signatureAlgorithm, key);
        long expMillis = nowMillis + TTLMILLIS;
        Date exp = new Date(expMillis);
        builder.setExpiration(exp);
        return builder.compact();
    }*/

    /**
     * author lixq
     * date 2018/8/13
     * description 验证token
     * @param
     * @return
     */
    /*public static Map<String, Object> isJwtValid(String jwt){
        if(StringUtils.isEmpty(jwt)){
            throw new SignatureException("token不能为空:");
        }
        try {
            SecretKey key = generalKey();
            Map<String, Object> map = Jwts.parser().setSigningKey(key).parseClaimsJws(jwt).getBody();
            return map;
        }
        //在解析JWT字符串时，如果密钥不正确，将会解析失败，抛出SignatureException异常，说明该JWT字符串是伪造的
        catch (SignatureException e) {
            LOGGER.error("token字符串是伪造的:" + e.getMessage(), e);
            throw new SignatureException("token字符串是伪造的:" + e.getMessage(), e);
        }
        //在解析JWT字符串时，如果‘过期时间字段’已经早于当前时间，将会抛出ExpiredJwtException异常，说明本次请求已经失效
        catch (ExpiredJwtException e){
            LOGGER.error("token过期:" + e.getMessage(), e);
            throw new SignatureException("token过期:" + e.getMessage(), e);
        }
        catch (MalformedJwtException e) {
            LOGGER.error("token不完整:" + e.getMessage(), e);
            throw new MalformedJwtException("token不完整:" + e.getMessage(), e);
        }
    }*/
    /**
     * 校验token是否正确
     * @param token 密钥
     * @param secret 用户的密码
     * @return 是否正确
     */
    public static boolean verify(String token, String username, String secret) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 获得token中的信息无需secret解密也能获得
     * @return token中包含的用户名
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 生成签名,1小时后过期
     * @param username 用户名
     * @return 加密的token
     */
    public static String sign(String username) {
        try {
            Date date = new Date(System.currentTimeMillis()+TTLMILLIS);
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
            // 附带username信息
            return JWT.create()
                    .withClaim("username", username)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }
}
