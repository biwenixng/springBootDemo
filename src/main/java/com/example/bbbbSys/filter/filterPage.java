//package com.example.bbbbSys.filter;
//
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @description: 过滤
// * @author: biwenxing
// * @create: 2023-01-28 20:42
// **/
//@Component
//@WebFilter(urlPatterns = "/*")
//public class filterPage implements Filter {
//
//    private final String[] IGNORE_URI = {"/account","/css/","/js/","/images","/favicon"};
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("---------进入过滤器----------");
//        HttpServletRequest request =  (HttpServletRequest)servletRequest;
//        HttpServletResponse response = (HttpServletResponse)servletResponse;
//        String url = request.getRequestURI();
//        Boolean isPass = PassUrl(url);
//        System.out.println("----filter----" + url);
//        if (isPass){
//            System.out.println("---------通过filter校验----------");
//            filterChain.doFilter(servletRequest, servletResponse);
//            return;
//        }else {
//            System.out.println("---------未通过filter校验----------");
//            response.sendRedirect("/account/error");
//            return;
//        }
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        // 加载 Filter 启动之前需要的资源
//        System.out.println("---------------Filter Init....");
//        Filter.super.init(filterConfig);
//    }
//
//    private Boolean PassUrl(String url) {
//        for (int i = 0; i < IGNORE_URI.length; i++) {
//            if (url.startsWith(IGNORE_URI[i])){
//                return  true;
//            }
//        }
//        return  false;
//    }
//}
