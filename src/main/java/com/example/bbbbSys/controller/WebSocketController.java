package com.example.bbbbSys.controller;

import com.example.bbbbSys.service.WebSocketServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @description:
 * @author: biwenxing
 * @create: 2024-01-03 14:40
 **/
@RestController
public class WebSocketController {
    // 推送数据到websocket客户端 接口
    @GetMapping("/socket/push/{cid}")
    public Map pushMessage(@PathVariable("cid") String cid, String message) {
        Map<String, Object> result = new HashMap<>();
        try {
            HashSet<String> sids = new HashSet<>();
            sids.add(cid);
            WebSocketServer.sendMessage("服务端推送消息：" + message, sids);
            result.put("code", cid);
            result.put("msg", message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
