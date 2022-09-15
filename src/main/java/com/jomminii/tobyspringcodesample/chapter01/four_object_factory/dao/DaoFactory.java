package com.jomminii.tobyspringcodesample.chapter01.four_object_factory.dao;

public class DaoFactory {
    public UserDao userDao() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        return new UserDao(connectionMaker);
    }
}
