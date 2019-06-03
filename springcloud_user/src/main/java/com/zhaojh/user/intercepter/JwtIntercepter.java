package com.zhaojh.user.intercepter;

import com.zhaojh.common.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 */
@Slf4j
@Component
public class JwtIntercepter extends HandlerInterceptorAdapter {

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("经过了拦截器");
        final String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer_")) {
            final String token = authHeader.substring(7); // The partafter "Bearer "
            Claims claims = jwtUtil.parseJWT(token);
            if (claims != null) {
                if("admin".equals(claims.get("roles"))){//如果是管理员
                    request.setAttribute("admin_claims", claims);
                }
                if("0".equals(claims.get("roles"))){//如果是普通用户
                    request.setAttribute("user_claims", claims);
                }
                if("1".equals(claims.get("roles"))){//如果是一级会员
                    request.setAttribute("user_claims", claims);
                }
                if("2".equals(claims.get("roles"))){//如果是二级会员
                    request.setAttribute("user_claims", claims);
                }
                if("3".equals(claims.get("roles"))){//如果是三级会员
                    request.setAttribute("user_claims", claims);
                }
            }
        }

        return true;
    }
}
