package com.jomminii.tobyspringcodesample.chapter01.four_object_factory_use.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws ClassNotFoundException, SQLException;
}
