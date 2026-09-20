package com.sonnet.dao.com.sonnet.dao.impl;

import com.sonnet.dao.com.sonnet.dao.UserDao;
import com.sonnet.pojo.User;
import com.sonnet.utils.DataSourceConfig;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    // 构建QueryRunner对象，这个对象主要就是进行数据表的CRUD操作
    QueryRunner queryRunner = new QueryRunner(DataSourceConfig.getDataSources());

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        BeanListHandler<User> userList = new BeanListHandler<>(User.class);
        try {
            return queryRunner.query(sql, userList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
