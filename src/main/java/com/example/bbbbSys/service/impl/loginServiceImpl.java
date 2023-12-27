package com.example.bbbbSys.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.bbbbSys.comon.vo.Result;
import com.example.bbbbSys.mapper.UserQuery;
import com.example.bbbbSys.pojo.User;
import com.example.bbbbSys.service.loginService;
import com.example.bbbbSys.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * 用户登录
 *
 * @author Administrator
 */
@Service
public class loginServiceImpl implements loginService {
    @Autowired
    private UserQuery userQuery;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private AuthenticationManager authenticationManager;



    @Override
    public Map<String, Object> userLogin(User user) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);


//        List<User> users = userQuery.loginUser(user);
//        User loginUser = users.get(0);
        if(Objects.isNull(authenticate)){
            throw new RuntimeException("用户名或密码错误");
        }
        User loginUser = (User) authenticate.getPrincipal();
        String userId = loginUser.getUserName();
        String jwt = JwtUtil.createJWT(userId);
        redisTemplate.opsForValue().set("login:"+userId,loginUser);
        HashMap<String, Object> data = new HashMap<>();
        data.put("token", jwt);
        return data;
    }

    @Override
    public Map<String,Object> getUerInfo(String token) {
        Object object = redisTemplate.opsForValue().get(token);
        if (object != null){
//            User user = JSON.parseObject(JSON.toJSONString(object), User.class);
//            HashMap<String, Object> map = new HashMap<>();
//            map.put("name",user.getUsername());
//            map.put("avatar",user.getAvatar());
//            return  map;
            return  new HashMap<>();
        }else{
          return  null;
        }
    }
}
