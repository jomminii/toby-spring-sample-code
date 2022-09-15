package com.jomminii.tobyspringcodesample.chapter01.three_relationship_setting;

import com.jomminii.tobyspringcodesample.chapter01.three_relationship_setting.dao.ConnectionMaker;
import com.jomminii.tobyspringcodesample.chapter01.three_relationship_setting.dao.DConnectionMaker;
import com.jomminii.tobyspringcodesample.chapter01.three_relationship_setting.dao.UserDao;
import com.jomminii.tobyspringcodesample.chapter01.three_relationship_setting.domain.User;
import java.sql.SQLException;

public class TestMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao dao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("testId");
        user.setName("테스트아이디");
        user.setPassword("password");

        dao.delete();
        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");
    }
}
