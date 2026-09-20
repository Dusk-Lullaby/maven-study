package com.sonnet.service.com.sonnet.service.impl;

import com.sonnet.dao.com.sonnet.dao.UserDao;
import com.sonnet.dao.com.sonnet.dao.impl.UserDaoImpl;
import com.sonnet.pojo.User;
import com.sonnet.service.com.sonnet.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }
}
