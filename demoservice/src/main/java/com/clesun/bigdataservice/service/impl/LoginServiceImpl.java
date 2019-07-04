package com.clesun.bigdataservice.service.impl;

import com.clesun.bigdataservice.dao.CUserMapper;
import com.clesun.bigdataservice.dto.LoginDTO;
import com.clesun.bigdataservice.entity.CUser;
import com.clesun.bigdataservice.entity.CUserExample;
import com.clesun.bigdataservice.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * author rxx
 * date 2018/5/22
 * 登录控制接口实现类
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private CUserMapper cUserMapper;


    @Override
    public LoginDTO authLogin(CUser cUser) {
        LoginDTO loginDTO = new LoginDTO();
        String phoneNo = cUser.getPhoneNo();
        //String password = cUser.getUserPassword();

        CUser userDetail = getUserByPhoneNo(phoneNo);
        loginDTO = getInfo(userDetail.getUserId());

        //Subject currentUser = SecurityUtils.getSubject();
        //UsernamePasswordToken token = new UsernamePasswordToken(phoneNo, password);
        //currentUser.login(token);

        //loginDTO.setSessionID(currentUser.getSession().getId().toString());
        /*if (userBean.getPasswrod().equals(cUser.getUserPassword())) {
            String token = JWTUtil.buildJwt(cUser.getUserName(),loginInfo.getPassword());
            //SessionManager.addOrUpdateSessionEntity(token,SessionManager.USER_BEAN,userBean);
                   }*/
        return loginDTO;
    }

    @Override
    public int logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return 1;
    }

    @Override
    public CUser getUserByPhoneNo(String phoneNo) {
        CUserExample cUserExample = new CUserExample();
        cUserExample.createCriteria().andPhoneNoEqualTo(phoneNo);
        List<CUser> cUsers = cUserMapper.selectByExample(cUserExample);

        if (cUsers.size() == 0 || null == cUsers) {
            throw new UnknownAccountException("手机号不存在");
        }

        if (cUsers.size() > 1) {
            throw new UnknownAccountException("存在重复手机号");
        }

        return cUsers.get(0);
    }

    @Override
    public LoginDTO getInfo(Long userId) {
        LoginDTO loginDTO = new LoginDTO();
        CUser cUser = cUserMapper.selectByPrimaryKey(userId);
        loginDTO.setLoginDTOParameters(cUser);
        /*Map<String, String> resources = listResourcesByUserId(userId);
        if (null != resources && resources.size() != 0) {
            loginDTO.setMenuList(resources.get("menuList"));
            loginDTO.setPermissionList(resources.get("permissionList"));
            loginDTO.setModuleList(resources.get("moduleList"));
            loginDTO.setApiList(resources.get("apiList"));
        }*/
        return loginDTO;
    }

    /**
     * author rxx
     * date 2018/5/23
     * description  根据userId 获得该user所有的menu，permission，module，api权限
     *
     * @param
     * @return
     */
    /*private Map<String, String> listResourcesByUserId(Long userId) {
        Map<String, String> Resources = new Hashtable<>();
        StringBuilder menuListBuilder = new StringBuilder();
        StringBuilder permissionListBuilder = new StringBuilder();
        StringBuilder moduleListBuilder = new StringBuilder();
        StringBuilder apiListBuilder = new StringBuilder();

        String roleList = userService.getUserRoleById(userId);

        if (null == roleList || roleList == "") {
            return null;
        }

        List<Long> roleIdList = stringToIdList(roleList);
        Set<CModule> cModules = new HashSet<>();
        for (Long roleId : roleIdList) {
            List<Long> moduleIdList = stringToIdList(roleService.getModuleTreeByRole(roleId));
            if (null == moduleIdList || moduleIdList.size() == 0) {
                return null;
            }
            for (Long moduleId : moduleIdList) {
                CModule cModule = cModuleMapper.selectByPrimaryKey(moduleId);
                cModules.add(cModule);
            }
        }

        for (CModule cModule : cModules) {

            if (cModule.getModPermission() == "" && cModule.getModUrl() == ""
                    && null == cModule.getModUrl() && null == cModule.getModPermission()) {
                continue;
            }

            // 根据modtype判断,menu(0)，permission(1)，module(2)，api(3)
            switch (cModule.getModType()) {
                case 0:
                    menuListBuilder.append(cModule.getModName() + ":" + cModule.getModUrl() + ",");
                    break;
                case 1:
                    permissionListBuilder.append(cModule.getModPermission() + ",");
                    break;
                case 2:
                    moduleListBuilder.append(cModule.getModUrl() + ",");
                    break;
                case 3:
                    apiListBuilder.append(cModule.getModPermission() + ",");
                    break;
                default:
                    break;
            }
        }

        Resources.put("menuList", validateString(menuListBuilder));
        Resources.put("permissionList", validateString(permissionListBuilder));
        Resources.put("moduleList", validateString(moduleListBuilder));
        Resources.put("apiList", validateString(apiListBuilder));

        return Resources;
    }*/

    /**
     * author rxx
     * date 2018/5/23
     * description 把使用“,”分隔的id 字符串转化为List<Long>
     *
     * @param
     * @return
     */
    private List<Long> stringToIdList (String string) {
        List<Long> list = new ArrayList<>();

        if (null == string || string == "") {
            return null;
        }

        for (String roleId : string.split(",")) {
            list.add(Long.parseLong(roleId));
        }
        return list;
    }

    /**
     * author rxx
     * date 2018/5/23
     * description 处理空字符串及字符串末尾多“,”的问题
     * @param
     * @return
     *
     */
    private String validateString (StringBuilder sb) {
        if (sb.length() == 0 || null == sb) {
            return "";
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
