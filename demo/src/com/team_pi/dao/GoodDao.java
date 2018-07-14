package com.team_pi.dao;

import com.team_pi.entity.Good;

import java.util.ArrayList;

public interface GoodDao {
    public int insert(Good good) throws Exception;
    public int update(Good good) throws  Exception;
    public int delete(int id) throws Exception;
    public Good getOne(int id) throws Exception;
    public ArrayList<Good> getList() throws Exception;
}
