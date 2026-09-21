package com.sonnet.dao;

import com.sonnet.dao.impl.UserDaoImpl;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void test01() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.findAll());
    }
}
