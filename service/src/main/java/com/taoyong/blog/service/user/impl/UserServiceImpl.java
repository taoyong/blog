package com.taoyong.blog.service.user.impl;

import com.taoyong.blog.domain.user.User;
import com.taoyong.blog.service.user.UserService;
import user.UserDao;

/**
 * Created by taoyong on 15/12/13.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public User getUserById(int id) {
        return userDao.getById(id);
    }

    public int deleteUserById(int id) {
        return userDao.deleteById(id);
    }

    public void updateUser(User user) {

        userDao.update(user);
    }

    public void addUser(User user) {

        userDao.add(user);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
