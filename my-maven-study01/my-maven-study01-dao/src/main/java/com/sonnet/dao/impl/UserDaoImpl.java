package com.sonnet.dao.impl;

import com.sonnet.dao.UserDao;
import com.sonnet.pojo.User;
import com.sonnet.utils.DataSourceConfig;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    QueryRunner queryRunner = new QueryRunner(DataSourceConfig.getDataSources());

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        BeanListHandler<User> beanListHandler = new BeanListHandler<>(User.class);
        try {
            return queryRunner.query(sql, beanListHandler);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
