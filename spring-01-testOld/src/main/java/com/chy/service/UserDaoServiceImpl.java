package com.chy.service;

import com.chy.dao.UserDao;

public class UserDaoServiceImpl implements UserDaoService {

    private UserDao userDao;

    public void setUserDao(UserDao userdao) {
        this.userDao = userdao;
    }

    @Override
    public void getName() {
        userDao.getName();
    }
}
