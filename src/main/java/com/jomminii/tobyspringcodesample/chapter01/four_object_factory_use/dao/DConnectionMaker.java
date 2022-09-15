package com.jomminii.tobyspringcodesample.chapter01.four_object_factory_use.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");

        return DriverManager.getConnection(
            "url",
            "user",
            "password"
        );
    }
}
