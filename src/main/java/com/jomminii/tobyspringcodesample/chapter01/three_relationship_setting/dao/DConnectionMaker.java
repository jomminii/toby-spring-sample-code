package com.jomminii.tobyspringcodesample.chapter01.three_relationship_setting.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // 입맛대로 DB Connection 기능을 구현
        return null;
    }
}
