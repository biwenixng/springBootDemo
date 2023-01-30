package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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
    public String error() {
        System.out.println("error");
        return "error";
    }
}
