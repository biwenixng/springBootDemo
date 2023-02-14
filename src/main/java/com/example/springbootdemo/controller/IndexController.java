package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContextEvent;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/account")
public class IndexController {

    @Autowired
    Person person;
    @RequestMapping(  "/loginMapper")
    public String login() {
        System.out.println("login");
        return "login";
    }

    @RequestMapping(  "/errorMapper")
    public String error(HttpServletResponse httpServletResponse, ServletContextEvent s) throws IOException {
        System.out.println("error");
        Cookie cookie = new Cookie("NIMA","hh");
        Cookie cookie1 = new Cookie("NIMA1","hh1");
        Cookie cookie3 = new Cookie("NIMA","hh");
        httpServletResponse.addCookie(cookie);
        httpServletResponse.addCookie(cookie1);
        httpServletResponse.addCookie(cookie3);
        return "error";
    }
}
