package com.zhaojh.spit.intercepter;

import com.zhaojh.common.pojo.Result;
import com.zhaojh.common.pojo.StatusCode;
import com.zhaojh.common.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 拦截器 对用户的登录进行拦截
 */
@Slf4j
@Component
public class JwtIntercepter extends HandlerInterceptorAdapter {

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        log.info("进入吐槽模块的前置拦截器jwtInterceptor");
        final String authorization = request.getHeader("Authorization"); //因为是当前的用户信息  确保不能被非法修改
        if(authorization!=null&&authorization.startsWith("Bearer_"))
        {
            //authorization 不为空且字符串的开头是以 Bearer_开头
            final String token = authorization.substring(7);//从字符串的第7为开始截取
            Claims claims = jwtUtil.parseJWT(token);
            switch ((String) claims.get("roles")){
                case "admin":
                    request.setAttribute("admin_claims", claims);
                    request.setAttribute("token", token);
                    break;
                case "0":
                    request.setAttribute("user_claims_ordinary", claims);
                    request.setAttribute("token", token);
                    break;
                case "1":
                    request.setAttribute("user_claims_vip1", claims);
                    request.setAttribute("token", token);
                    break;
                case "2":
                    request.setAttribute("user_claims_vip2", claims);
                    request.setAttribute("token", token);
                    break;
                case "3":
                    request.setAttribute("user_claims_vip3", claims);
                    request.setAttribute("token", token);
                    break;
            }

        }
        return true;
    }
}
