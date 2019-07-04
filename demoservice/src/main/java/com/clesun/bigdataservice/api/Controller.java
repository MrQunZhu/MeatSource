package com.clesun.bigdataservice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(){
        return "server被调用了！:" +port;
    }

    @RequestMapping("/hello")
    public String Hello() {
        return "hello world";
    }
}
