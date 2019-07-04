package com.clesun.client.service;


import com.clesun.client.entity.CUser;
import feign.hystrix.FallbackFactory;

/**
 * author: lixq
 * date: 2018/8/17
 * 描述:
 */
public class Error implements FallbackFactory<LoginService> {

    @Override
    public LoginService create(Throwable throwable) {
        return new LoginService() {
            @Override
            public String test() {
                return "error";
            }

            @Override
            public String login(CUser cUser) {
                return "error";
            }
        };
    }
}
