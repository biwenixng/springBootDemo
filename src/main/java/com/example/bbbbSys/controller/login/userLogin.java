package com.example.bbbbSys.controller.login;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.bbbbSys.comon.vo.Result;
import com.example.bbbbSys.pojo.User;
import com.example.bbbbSys.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/user")
//@CrossOrigin //跨域
public class userLogin {
    @Autowired
    private loginService loginService;

    @PostMapping("/login")
    public Result<Map<String, Object>> userLogin(@RequestBody User user) {
        Map<String, Object> data = loginService.userLogin(user);
        if (data != null){
          return  Result.success(data);
        }
        return Result.fail();
    }

    @GetMapping("/info")
    public Result<Map<String, Object>> userLogin(@RequestParam("token") String token) {
        Map<String, Object> user = loginService.getUerInfo(token);
        if (user == null){
            return  Result.fail("token无效");
        }
        return Result.success(user);
    }

    @PostMapping("/loginOut")
    public Result<Map<String, Object>> loginOut(@RequestHeader("X-Token") String token) {
        return Result.success();
    }

    @PostMapping("/test")
    public Result<Map<String, Object>> test(@RequestBody JSONObject json) {
        System.out.println(json.toJSONString());
        return Result.success();
    }
}
