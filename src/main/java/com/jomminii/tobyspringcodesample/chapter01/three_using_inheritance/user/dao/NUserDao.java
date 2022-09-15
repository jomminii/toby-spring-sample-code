package com.jomminii.tobyspringcodesample.chapter01.three_using_inheritance.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDao {

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // 독립된 DB Connection 구현
        Class.forName("org.mariadb.jdbc.Driver");

        return DriverManager.getConnection(
            "url",
            "user",
            "password"
        );

    }
}
