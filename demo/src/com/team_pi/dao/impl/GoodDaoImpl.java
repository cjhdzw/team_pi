package com.team_pi.dao.impl;

import com.team_pi.dao.GoodDao;
import com.team_pi.entity.Good;
import com.team_pi.util.DbUtil;

import java.util.ArrayList;
import java.util.Map;

public class GoodDaoImpl implements GoodDao {
    @Override
    public int insert(Good good) throws Exception {
        String sql = "insert into goods(no,name,price,memo) values(?,?,?,?)";
        ArrayList<Object> list = new ArrayList<>();
        list.add(good.getNo());
        list.add(good.getName());
        list.add(good.getPrice());
        list.add(good.getMemo());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int update(Good good) throws Exception {
        String sql = "update goods set no = ?, name = ?, price = ?, memo = ? where id = ?";
        ArrayList<Object> list  = new ArrayList<>();
        list.add(good.getNo());
        list.add(good.getName());
        list.add(good.getPrice());
        list.add(good.getMemo());
        list.add(good.getId());
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public int delete(int id) throws Exception {
        String sql = "delete from goods where id = ?";
        ArrayList<Object> list  = new ArrayList<>();
        list.add(id);
        return DbUtil.executeUpdate(sql,list);
    }

    @Override
    public Good getOne(int id) throws Exception {
        String sql = "select * from goods where id = ?";
        Good good = null;
        for(Map<String,Object> m : DbUtil.executeQuery(sql,null)){
            good = new Good();
            good.setId((int)m.get("id"));
            good.setName((String)m.get("name"));
            good.setNo((String)m.get("no"));
            good.setMemo((String)m.get("memo"));
            good.setPrice((double)m.get("price"));
        }
        return good;
    }

    @Override
    public ArrayList<Good> getList() throws Exception {
        String sql = "select * from goods";
        ArrayList<Good> goodList = new ArrayList<>();
        for(Map<String,Object> m : DbUtil.executeQuery(sql,null)){
            Good good = new Good();
            good.setId((int)m.get("id"));
            good.setName((String)m.get("name"));
            good.setNo((String)m.get("no"));
            good.setMemo((String)m.get("memo"));
            good.setPrice((double)m.get("price"));
            goodList.add(good);
        }
        return goodList;
    }
}
