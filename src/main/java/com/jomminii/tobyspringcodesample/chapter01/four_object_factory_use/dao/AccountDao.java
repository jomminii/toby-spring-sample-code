package com.jomminii.tobyspringcodesample.chapter01.four_object_factory_use.dao;

public class AccountDao {

    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
