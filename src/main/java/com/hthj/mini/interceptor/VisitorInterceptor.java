package com.hthj.mini.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class VisitorInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info(new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date()) + " --> " + request.getRemoteHost() + " --> 访问了服务器");
        return true;
    }
}
