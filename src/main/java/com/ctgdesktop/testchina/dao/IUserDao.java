package com.ctgdesktop.testchina.dao;

import com.ctgdesktop.testchina.entity.User;
import com.ctgdesktop.testchina.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface IUserDao extends UserMapper {
    List<User> findByName(@Param("userName") String username);

    User selectById(@Param("id") Integer id);
}