package com.sonnet.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceConfig {

    public static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

    /**
     * 获取数据源
     * @return 数据源
     */
    public static DataSource getDataSources() {
        return comboPooledDataSource;
    }

    /**
     * 获取数据连接对象
     * @return 数据连接对象
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return comboPooledDataSource.getConnection();
    }
}
