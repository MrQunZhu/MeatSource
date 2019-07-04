package com.clesun.bigdataservice.dto;

import com.alibaba.fastjson.JSON;
import com.clesun.bigdataservice.entity.CUser;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * author rxx
 * date 2018/5/22
 * 登录后返回的登录信息类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginDTO {

    private Long userId;

    private String sessionID;

    private String userName;

    private String phoneNo;

    private String email;

    private String farmId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String roleList;

    private String menuList;

    private String permissionList;

    private String moduleList;

    private String apiList;

    public void setLoginDTOParameters (CUser cUser) {
        this.userId = cUser.getUserId();
        this.userName = cUser.getUserName();
        this.phoneNo = cUser.getPhoneNo();
        this.email = cUser.getEmail();
        this.farmId = cUser.getFarmId();
        this.createTime = cUser.getCreateTime();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFarmId() {
        return farmId;
    }

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRoleList() {
        return roleList;
    }

    public void setRoleList(String roleList) {
        this.roleList = roleList;
    }

    public String getMenuList() {
        return menuList;
    }

    public void setMenuList(String menuList) {
        this.menuList = menuList;
    }

    public String getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(String permissionList) {
        this.permissionList = permissionList;
    }

    public String getModuleList() {
        return moduleList;
    }

    public void setModuleList(String moduleList) {
        this.moduleList = moduleList;
    }

    public String getApiList() {
        return apiList;
    }

    public void setApiList(String apiList) {
        this.apiList = apiList;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
