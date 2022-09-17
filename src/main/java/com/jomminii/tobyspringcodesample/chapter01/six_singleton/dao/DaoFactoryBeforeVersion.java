package com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao;

import com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao.AccountDao;
import com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao.ConnectionMaker;
import com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao.DConnectionMaker;
import com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao.UserDao;

public class DaoFactoryBeforeVersion {
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    private ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }
}
