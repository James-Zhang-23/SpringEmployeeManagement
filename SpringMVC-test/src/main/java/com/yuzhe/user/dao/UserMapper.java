package com.yuzhe.user.dao;

import com.yuzhe.user.pojo.User;

import java.util.List;

public interface UserMapper {

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
