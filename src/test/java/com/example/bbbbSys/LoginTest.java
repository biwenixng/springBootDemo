package com.example.bbbbSys;

import com.example.bbbbSys.mapper.UserQuery;
import com.example.bbbbSys.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class LoginTest {
    //    @Autowired
//    private UserQuery userQuery;
//
//    @Test
//    public void userLogin(){
//        User user = new User();
//        user.setUserName("admin");
//        user.setPassword("123456");
//        List<User> users = userQuery.loginUser(user);
//        System.out.println(users);
//    }
    @Test
    public void test() {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Map collect1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toMap(i -> i, i -> i * i));
//        List collect2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        long count = list.stream().filter(i -> i % 2 == 0).count();
//        List<Map> list1 = new ArrayList();
//        Map<String, String> collect = Arrays.asList(
//                new String[]{"1", "one"},
//                new String[]{"2", "two"},
//                new String[]{"3", "three"}
//        ).stream().collect(Collectors.toMap(pair -> pair[0], pair -> pair[1]));
//
        List<Map> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            Map<String, String> map = new HashMap();
            map.put("name", i + "name");
            map.put("value", i + "value");
            list.add(map);
        }

        list = list.stream().peek(map -> {
            Optional.ofNullable(map.get("name")).ifPresent(name -> {
                if (map.get("name").equals("1name")) {
                    map.put("value", "1name++");
                }
            });
        }).filter(map -> !"2name".equals(map.get("name"))).collect(Collectors.toList());
        list.stream().map(map -> map.get("name").toString()).collect(Collectors.joining(","));

        List<String> names = Arrays.asList("Alice", "Bob", "Carol");
        String collect11 = names.stream().collect(Collectors.joining(","));
        Map<Object, Map> name = list.stream().collect(Collectors.toMap(map -> map.get("name"), map -> map));
            Optional.ofNullable(name.get("1name")).ifPresent(map -> {
                System.out.println(map);
            });

        List<String> list22 = Arrays.asList("1 2", "3 4", "5 6");

//        System.out.println(name);
//        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David", "Eve");
//        List<Integer> lengths = names.stream()
//                .map(String::length)
//                .collect(Collectors.toList());
//        lengths.forEach(System.out::println);
        list.forEach(System.out::println);


    }
}
