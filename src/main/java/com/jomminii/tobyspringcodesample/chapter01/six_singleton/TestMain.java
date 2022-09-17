package com.jomminii.tobyspringcodesample.chapter01.six_singleton;

import com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao.DaoFactory;
import com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao.DaoFactoryBeforeVersion;
import com.jomminii.tobyspringcodesample.chapter01.six_singleton.dao.UserDao;
import com.jomminii.tobyspringcodesample.chapter01.six_singleton.domain.User;
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

        // 동일한 오브젝트인지 확인
        UserDao dao1 = context.getBean("userDao", UserDao.class);
        UserDao dao2 = context.getBean("userDao", UserDao.class);

        System.out.println("dao1 = " + dao1);
        System.out.println("dao2 = " + dao2);
        System.out.println("dao1 == dao2 = " +  (dao1 == dao2));

        DaoFactoryBeforeVersion daoFactory = new DaoFactoryBeforeVersion();
        UserDao userDao1 = daoFactory.userDao();
        UserDao userDao2 = daoFactory.userDao();
        System.out.println("userDao1 = " + userDao1);
        System.out.println("userDao2 = " + userDao2);
        System.out.println("userDao1 == userDao2 = " +  (userDao1 == userDao2));
    }
}
