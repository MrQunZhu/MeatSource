package com.clesun.bigdataservice.config.shiro;

import com.clesun.bigdataservice.dto.LoginDTO;
import com.clesun.bigdataservice.entity.CUser;
import com.clesun.bigdataservice.service.LoginService;
import com.clesun.bigdataservice.utils.JWTUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * author rxx
 * date 2018/5/22
 * 自定义Realm
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    private LoginService loginService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        Session session = SecurityUtils.getSubject().getSession();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        LoginDTO loginDTO = (LoginDTO) session.getAttribute("accountInfo");
        String permissions = loginDTO.getPermissionList();

        if (null == permissions || permissions == "") {
            return authorizationInfo;
        }

        List<String> list = new ArrayList<>();
        for (String permission : permissions.split(",")) {
            list.add(permission);
        }

        authorizationInfo.addStringPermissions(list);

        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        /*// 使用手机号登录
        String phoneNumber = (String) token.getPrincipal();
        // 获取用户密码
        String password = new String((char[]) token.getCredentials());
        CUser cUser = loginService.getUserByPhoneNo(phoneNumber);

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                cUser.getPhoneNo(),
                cUser.getUserPassword(),
                ByteSource.Util.bytes(cUser.getPhoneNo()),
                getName()
        );

        LoginDTO loginDTO = loginService.getInfo(cUser.getUserId());
        SecurityUtils.getSubject().getSession().setAttribute("accountInfo", loginDTO);
        SecurityUtils.getSubject().getSession().setAttribute("token", JWTUtil.buildJwt());

        return simpleAuthenticationInfo;*/
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtil.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token无效");
        }

        CUser user = loginService.getUserByPhoneNo(username);
        if (user == null) {
            throw new AuthenticationException("用户不存在");
        }

        if (! JWTUtil.verify(token, username, user.getUserPassword())) {
            throw new AuthenticationException("用户名或密码错误");
        }

        return new SimpleAuthenticationInfo(token, token, "my_realm");
    }
}
