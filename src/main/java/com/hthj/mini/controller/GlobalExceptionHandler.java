package com.hthj.mini.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("advice");
        if (response.getStatus() == 404) {
            modelAndView.setViewName("404");
            modelAndView.addObject("requestUrl", request.getRequestURI());
            return modelAndView;
        } else {
            modelAndView.setViewName("500");
            return modelAndView;
        }
    }
}
