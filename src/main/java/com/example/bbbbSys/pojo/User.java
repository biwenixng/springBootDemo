package com.example.bbbbSys.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * 用户实体类
 * @author biwenxing
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -3837791302326836966L;
    private String id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String status;
    private String avatar;
    private String deleted;
}
