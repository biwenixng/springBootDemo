package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author biwenxing
 */
@Mapper
public interface myBatis {
    @Select("select * from `springBoot`.user")
    public List<User> queryUser();

    public List<User> queryUser1();
}
