package com.sonnet.dao.com.sonnet.dao;

import com.sonnet.pojo.User;

import java.util.List;

public interface UserDao {

    // 查询用户所有信息的方法
    public List<User> findAll();
}
