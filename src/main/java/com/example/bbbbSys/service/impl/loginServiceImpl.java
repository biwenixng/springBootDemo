package com.example.bbbbSys.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.bbbbSys.comon.vo.Result;
import com.example.bbbbSys.mapper.UserQuery;
import com.example.bbbbSys.pojo.User;
import com.example.bbbbSys.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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

    @Override
    public Map<String, Object> userLogin(User user) {
        List<User> users = userQuery.loginUser(user);
        if (users.size() == 0) {
            return null;
        }
        User userInfo = users.get(0);
        String token = "user" + UUID.randomUUID();
        redisTemplate.opsForValue().set(token, userInfo, 30, TimeUnit.MINUTES);
        HashMap<String, Object> data = new HashMap<>();
        data.put("token", token);
        return data;
    }

    @Override
    public Map<String,Object> getUerInfo(String token) {
        Object object = redisTemplate.opsForValue().get(token);
        if (object != null){
            User user = JSON.parseObject(JSON.toJSONString(object), User.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("name",user.getUsername());
            map.put("avatar",user.getAvatar());
            return  map;
        }else{
          return  null;
        }
    }
}
