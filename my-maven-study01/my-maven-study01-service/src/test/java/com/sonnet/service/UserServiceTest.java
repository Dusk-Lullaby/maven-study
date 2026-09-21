package com.sonnet.service;

import com.sonnet.pojo.User;
import com.sonnet.service.impl.UserServiceImpl;
import org.junit.Test;

import java.util.List;

public class UserServiceTest {

    @Test
    public void test01() {
        UserService service = new UserServiceImpl();
        List<User> userList = service.findAllUser();
        userList.forEach(System.out::println);
    }
}
