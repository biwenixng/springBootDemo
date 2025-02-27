package com.example.bbbbSys;

import com.sun.deploy.net.HttpUtils;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: biwenxing
 * @create: 2025-02-27 17:11
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class elkTest {
    private static final Logger log = LoggerFactory.getLogger(HttpUtils.class);

    public static void main(String[] args) {
        log.info("输出info");
        log.debug("输出debug");
        log.error("输出error");
    }

}
