package com.clesun.client.service;

import com.clesun.client.entity.CUser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient( value = "service-A",fallback = Error.class)
public interface LoginService {
    @RequestMapping("/test")
    public String test();

    @RequestMapping(value = "/clesun/bigData/api/v1.0/login",method = RequestMethod.POST,consumes = "application/json")
    public String login(@RequestBody(required = false) CUser cUser);
}
