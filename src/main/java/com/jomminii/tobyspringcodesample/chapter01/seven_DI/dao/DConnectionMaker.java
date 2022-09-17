package com.jomminii.tobyspringcodesample.chapter01.seven_DI.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/board_v1?allowPublicKeyRetrieval=true&useSSL=false",
            "board_root",
            "whdals12#$"
        );
    }
}
