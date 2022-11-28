package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface myBatis {
    @Select("select * from `my data`.user")
    public List<User> queryUser();
}
