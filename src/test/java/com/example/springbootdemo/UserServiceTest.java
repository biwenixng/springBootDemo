package com.example.springbootdemo;


import com.example.springbootdemo.pojo.Person;
import com.example.springbootdemo.service.UserService;

import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    public void test(){
        service.add();
    }

    @Test
    public void test1(){
//        new Thread(
//            () ->{
//                String name = Thread.currentThread().getName();
//                System.out.println("线程1启动:" + name );
//            })
//        .start();

//        List list = Stream.of("aaaaaaaaaaaaaaaa",2,3).collect(Collectors.toList());;
//        list.forEach(s -> System.out.println(s));
//
//        List<String> list = new ArrayList<>();
//        list.add("刘德华,36");
//        list.add("张学友,46");
//        list.add("黎明,26");
//        list.add("谢霆锋,18");
//        list.add("郭富城,40");
//        List list1 = list.stream().filter(strings -> Integer.parseInt(strings.split(",")[1]) > 28).collect(Collectors.toList());
//        for (Object name : list1) {
//            System.out.println(name);
//        }
//        System.out.println("------------------------------");
//        String[] names = {"刘德华,36","张学友,46","黎明,26","谢霆锋,18","郭富城,40"};
//        Map map1 = Stream.of(names).collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
//        Map map2 = (Map) list1.stream().collect(Collectors.toMap(s -> s.toString().split(",")[0], s -> s.toString().split(",")[1]));
//        for (Object s : map1.keySet()){
//            System.out.println(s+ ":" + map1.get(s));
//        }
//        System.out.println("------------------------------");
//        for (Object s : map2.keySet()){
//            System.out.println(s+ ":" +map2.get(s));
//        }
//        Optional<Object> o = Optional.ofNullable(null);
//        if (!o.isPresent() || "".equals(o.get())){
//            System.out.println("**不能为空");
//        }
//        String map = o.map(s -> s == null).map(s -> "value").orElse("");

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        System.out.println("getMonth---------"+time.getMonth().getValue());
        System.out.println("getYear----------"+time.getYear());
        System.out.println("getDayOfYear--------"+time.getDayOfYear());
        System.out.println("getDayOfMonth----------"+time.getDayOfMonth());
        System.out.println("getMinute----------"+time.getMinute());
        System.out.println(time.plusDays(10).plusYears(-10));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        System.out.println("1---------"+time.format(dtf));
        System.out.println("2---------"+dtf.format(time));
        LocalDateTime time1 = LocalDateTime.parse("20220203111111",dtf);
        System.out.println(time1);
    }

}
