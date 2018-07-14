package com.team_pi.dao;

import com.team_pi.entity.User;

import java.util.ArrayList;

public interface UserDao {
    public int insert(User user) throws Exception;
    public int update(User user) throws Exception;
    public int delete(int id) throws Exception;
    public User getOne(int id) throws Exception;
    public ArrayList<User> getList() throws Exception;
}
