package com.example.bbbbSys.mapper;

import com.example.bbbbSys.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 */

@Mapper
@Repository
public interface UserQuery {
    /**
     * 查询用户
     * @param user
     * @return
     */
    List<User> loginUser(User user);

    List<Map> testUser(User user);
}
