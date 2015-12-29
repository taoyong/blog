package com.taoyong.blog.service.user;

import com.taoyong.blog.domain.user.User;

/**
 * Created by taoyong on 15/12/13.
 */
public interface UserService {

    User getUserById(int id);

    int deleteUserById(int id);

    void updateUser(User user);

    void addUser(User user);
}
