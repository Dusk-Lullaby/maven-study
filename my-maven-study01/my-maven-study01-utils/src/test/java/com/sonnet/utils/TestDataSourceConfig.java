package com.sonnet.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDataSourceConfig {

    @Test
    public void test01() {
        try (Connection connection = DataSourceConfig.getConnection()) {
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
