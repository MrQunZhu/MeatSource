package com.clesun.client.controller;

import com.clesun.client.dto.ResultEntity;
import com.clesun.client.entity.CUser;
import com.clesun.client.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private LoginService service;

    private ResultEntity entity = null;

    @RequestMapping("/test")
    public String test(){
        return service.test();
    }

    @PostMapping("/login")
    @ResponseBody
    public ResultEntity login(CUser cUser){
        try {
            entity = new ResultEntity(service.login(cUser),0,"登录成功");
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResultEntity(e.getMessage(),-1,"登录失败");
        }
        return entity;
    }
}
