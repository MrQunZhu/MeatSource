package com.clesun.bigdataservice.service;


import com.clesun.bigdataservice.dto.LoginDTO;
import com.clesun.bigdataservice.entity.CUser;

/**
 * author rxx
 * date 2018/5/22
 * 登录控制接口
 */
public interface LoginService {

    /**
     * author rxx
     * date 2018/5/23
     * description 登录表单提交
     * @param
     * @return
     *
     */
    LoginDTO authLogin(CUser cUser);

    /**
     * author rxx
     * date 2018/5/23
     * description 退出登录
     * @param
     * @return
     *
     */
    int logout();

    /**
     * author rxx
     * date 2018/5/22
     * description 根据手机号码返回User
     * @param
     * @return
     *
     */
    CUser getUserByPhoneNo(String phoneNo);

    /**
     * author rxx
     * date 2018/5/23
     * description 根据userId获得该user信息
     * @param
     * @return
     *
     */
    LoginDTO getInfo(Long userId);
}
