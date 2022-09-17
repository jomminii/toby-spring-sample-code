package com.jomminii.tobyspringcodesample.chapter01.six_singleton_status.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}
