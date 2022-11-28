package com.example.springbootdemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author biwenxing
 */
@Setter
@Getter
@ToString
@Component
public class User {
    private String USER_ID;
    private String USER_NAME;
}
