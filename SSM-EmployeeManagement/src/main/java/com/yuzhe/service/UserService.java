package com.yuzhe.service;

import com.yuzhe.pojo.User;

import java.util.List;

public interface UserService {
    //add
    int addUser(User user);

    //delete
    int deleteUser(int user_id);

    //update
    int updateUser(User user);

    //query one user
    User queryUserByID(int user_id);

    //query all user
    List<User> queryAllUser();
}
