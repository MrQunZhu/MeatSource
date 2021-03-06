package com.clesun.bigdataservice.config.shiro;

import com.alibaba.fastjson.JSONObject;
import com.clesun.bigdataservice.dto.ResultEntityOld;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * author rxx
 * date 2018/5/28
 * description 对没有登录的请求进行拦截, 覆盖掉shiro原本的跳转login.jsp的拦截方式
 *
 * @param
 * @return
 */
public class AjaxPermissionsAuthorizationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        PrintWriter out = null;
        HttpServletResponse res = (HttpServletResponse) response;

        ResultEntityOld entity = new ResultEntityOld(-1,"登录已过期，请重新登录！");

        try {
            res.setCharacterEncoding("UTF-8");
            res.setContentType("application/json");
            out = response.getWriter();
            out.println(JSONObject.toJSONString(entity));
        } catch (Exception e) {
        } finally {
            if (null != out) {
                out.flush();
                out.close();
            }
        }

//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("returnCode", ErrorEnum.E_20011.getErrorCode());
//        jsonObject.put("returnMsg", ErrorEnum.E_20011.getErrorMsg());
//        try {
//            res.setCharacterEncoding("UTF-8");
//            res.setContentType("application/json");
//            out = response.getWriter();
//            out.println(jsonObject);
//        } catch (Exception e) {
//        } finally {
//            if (null != out) {
//                out.flush();
//                out.close();
//            }
//        }

        return false;
    }

    @Bean
    public FilterRegistrationBean registration(AjaxPermissionsAuthorizationFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
        registration.setEnabled(false);
        return registration;
    }
}
