package com.example.bbbbSys;

import com.example.bbbbSys.mapper.UserQuery;
import com.example.bbbbSys.pojo.User;
import com.example.bbbbSys.service.impl.loginServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class LoginTest {
    @Autowired
    private UserQuery userQuery;

    @Test
    public void userLogin(){
        User user = new User();
        user.setUsername("1");
        user.setPassword("'1' or 1 = '1'");

        List<User> users = userQuery.loginUser(user);
        System.out.println(users);
    }
}
