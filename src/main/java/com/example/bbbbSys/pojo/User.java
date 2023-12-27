package com.example.bbbbSys.pojo;

import lombok.*;

import java.io.Serializable;
import java.math.BigInteger;

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
    private String userName;
    private String nickName;
    private String password;
    private char status;
    private String email;
    private String phoneNumber;
    private char sex;
    private String avatar;
    private char userType;
    private BigInteger createBy;
    private String createTime;
    private BigInteger updateBy;
    private String updateTime;
    private int delFlag;
}
