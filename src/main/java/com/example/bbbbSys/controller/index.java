package com.example.bbbbSys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: biwenxing
 * @create: 2024-04-22 16:01
 **/
@Controller
public class index {
    @RequestMapping("/")
    public String hello(){
        return "index";
    }

}
