package com.example.bbbbSys.service;

import com.example.bbbbSys.comon.vo.Result;
import com.example.bbbbSys.pojo.User;

import javax.xml.bind.annotation.XmlType;
import java.util.Map;

/**
 * 登录服务
 * @author Administrator
 */
public interface loginService {
    /**
     * 用户登录
     * user
     * @return
     */
    Map<String, Object> userLogin(User user);

    Map<String, Object> getUerInfo(String token);
}
