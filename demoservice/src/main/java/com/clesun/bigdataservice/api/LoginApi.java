package com.clesun.bigdataservice.api;

import com.clesun.bigdataservice.dto.LoginDTO;
import com.clesun.bigdataservice.dto.ResultEntity;
import com.clesun.bigdataservice.entity.CUser;
import com.clesun.bigdataservice.service.LoginService;
import com.clesun.bigdataservice.utils.JWTUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * author rxx
 * date 2018/5/22
 * 登录控制相关接口
 */

@RestController
@RequestMapping(value = "/clesun/bigData/api/v1.0")
public class LoginApi {

    @Autowired
    private LoginService loginService;

    ResultEntity entity = null;

    /**
     * author rxx
     * date 2018/5/23
     * description
     * @param
     * @return
     *
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public Map<String,Object> authLogin (@RequestBody(required = false)CUser cUser, HttpServletResponse response) {
        Map<String,Object> map = new HashMap<>();
        try {
            LoginDTO result = loginService.authLogin(cUser);
            map.put("user",result);
            map.put("token", JWTUtil.sign(result.getUserName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @PostMapping(value = "/logout")
    @ResponseBody
    public ResultEntity logout () {
        try {
            int result = loginService.logout();
            entity = new ResultEntity(result);
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity("登出失败");
            return entity;
        }
    }

    @RequestMapping(value = "/getInfo")
    public ResultEntity getInfo () {
        try {
            Session session = SecurityUtils.getSubject().getSession();
            Object loginDTO = session.getAttribute("accountInfo");
            entity = new ResultEntity(loginDTO);
            return entity;
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity("获取信息失败");
            return entity;
        }
    }

}
