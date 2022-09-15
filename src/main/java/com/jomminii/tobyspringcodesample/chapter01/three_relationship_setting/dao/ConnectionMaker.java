package com.jomminii.tobyspringcodesample.chapter01.three_relationship_setting.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}
