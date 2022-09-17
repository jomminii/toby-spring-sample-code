package com.jomminii.tobyspringcodesample.chapter01.six_singleton_status.dao;

public class AccountDao {

    private ConnectionMaker connectionMaker;

    public AccountDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
