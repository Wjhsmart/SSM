package com.jh.service.impl;

import com.jh.common.bean.Pager;
import com.jh.dao.UserDAO;
import com.jh.service.UserService;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/3/28.
 */
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public int insert(Object o) {
        return userDAO.insert(o);
    }

    @Override
    public int batchInsert(List list) {
        return userDAO.batchInsert(list);
    }

    @Override
    public int delete(Object o) {
        return userDAO.delete(o);
    }

    @Override
    public int deleteById(Serializable id) {
        return userDAO.deleteById(id);
    }

    @Override
    public int batchDelete(List list) {
        return userDAO.batchDelete(list);
    }

    @Override
    public int update(Object o) {
        return userDAO.update(o);
    }

    @Override
    public int batchUpdate(List list) {
        return userDAO.batchUpdate(list);
    }

    @Override
    public List queryAll() {
        return userDAO.queryAll();
    }

    @Override
    public List queryAll(String status) {
        return userDAO.queryAll(status);
    }

    @Override
    public Object query(Object o) {
        return userDAO.query(o);
    }

    @Override
    public Object queryById(Serializable id) {
        return userDAO.queryById(id);
    }

    @Override
    public List queryByPager(Pager pager) {
        return userDAO.queryByPager(pager);
    }

    @Override
    public int count() {
        return userDAO.count();
    }

    @Override
    public int inactive(String id) {
        return userDAO.inactive(id);
    }

    @Override
    public int active(String id) {
        return userDAO.active(id);
    }
}
