package com.jomminii.tobyspringcodesample.chapter01.six_singleton_status.dao;

import com.jomminii.tobyspringcodesample.chapter01.six_singleton_status.domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    private ConnectionMaker connectionMaker;
    private Connection c;
    private User user;

    public UserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
    public void add(User user) throws ClassNotFoundException, SQLException {
        this.c = connectionMaker.makeConnection();

        PreparedStatement ps = c.prepareStatement(
            "insert into users(id, name, password) values(?,?,?)"
        );
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();

        ps.close();
        c.close();

    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        c = connectionMaker.makeConnection();

        PreparedStatement ps = c.prepareStatement(
            "select * from users where id = ?"
        );

        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        this.user = new User();
        this.user.setId(rs.getString("id"));
        this.user.setName(rs.getString("name"));
        this.user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;
    }

    public void delete() throws ClassNotFoundException, SQLException {
        c = connectionMaker.makeConnection();

        PreparedStatement ps = c.prepareStatement(
            "delete from users where id = 'testId';"
        );

        ps.executeUpdate();

        ps.close();
        c.close();

    }
}
