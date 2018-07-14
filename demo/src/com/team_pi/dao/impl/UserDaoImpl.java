package com.team_pi.dao.impl;

import com.team_pi.dao.UserDao;
import com.team_pi.entity.User;
import com.team_pi.util.DbUtil;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    @Override
    public int insert(User user) throws Exception {
        String sql = "insert into users(username,password,sex,age) values(?,?,?,?)";
        ArrayList<Object> list = new ArrayList<>();
        list.add(user.getUsername());
        list.add(user.getPassword());
        list.add(user.getSex());
        list.add(user.getAge());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int update(User user) throws Exception {
        String sql = "update users set username = ?,password = ?,sex = ?,age = ? where id = ?";
        ArrayList<Object> list = new ArrayList<>();
        list.add(user.getUsername());
        list.add(user.getPassword());
        list.add(user.getSex());
        list.add(user.getAge());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int delete(int id) throws Exception {
        return 0;
    }

    @Override
    public User getOne(int id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<User> getList() throws Exception {
        return null;
    }
}
