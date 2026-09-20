package com.sonnet.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 封装数据库常用工具类
 */
public class DataSourceConfig {

    // 我们必须在resources目录里定义一个名字叫c3p0-config.xml配置文件
    // 在初始化ComboPooledDataSource对象的时候，会去自动加载这个c3p0-config.xml配置文件
    static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

    // 获取数据源的方法
    public static DataSource getDataSources() {
        return comboPooledDataSource;
    }

    // 获取数据连接的对象
    public static Connection getConnection() throws SQLException {
        return comboPooledDataSource.getConnection();
    }
}
