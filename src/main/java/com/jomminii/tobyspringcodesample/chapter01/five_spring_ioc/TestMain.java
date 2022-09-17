package com.jomminii.tobyspringcodesample.chapter01.five_spring_ioc;

import com.jomminii.tobyspringcodesample.chapter01.five_spring_ioc.dao.DaoFactory;
import com.jomminii.tobyspringcodesample.chapter01.five_spring_ioc.dao.UserDao;
import com.jomminii.tobyspringcodesample.chapter01.five_spring_ioc.domain.User;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);

        UserDao dao = context.getBean("userDao", UserDao.class);

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
