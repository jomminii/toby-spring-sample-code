package com.jomminii.tobyspringcodesample.chapter01.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDao extends UserDao {

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // 독립된 DB Connection 구현
        Class.forName("org.mariadb.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test",
            "testId",
            "password"
        );

    }
}
