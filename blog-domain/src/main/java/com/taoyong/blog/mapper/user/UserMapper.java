package com.taoyong.blog.mapper.user;

import com.taoyong.blog.domain.user.User;

/**
 * Created by taoyong on 15/12/13.
 */
public interface UserMapper {

    //根据ID查找用户
    User getById(int id);

    //添加一名用户
    int add(User user);

    //修改用户
    int update(User user);

    //删除用户
    int delete(int id);
}
