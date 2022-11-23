package com.example.springbootdemo.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author biwenxing
 */
@Setter
@Getter
@ToString
@Component
public class User {
    private String name;
    private Integer age;
}
