package com.jomminii.tobyspringcodesample.chapter01.five_spring_ioc.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}
