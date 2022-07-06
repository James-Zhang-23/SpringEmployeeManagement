package com.yuzhe.service;

import com.yuzhe.dao.UserMapper;
import com.yuzhe.pojo.User;

import java.util.List;

public class BookServiceImpl implements UserService {

    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int user_id) {
        return userMapper.deleteUser(user_id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User queryUserByID(int user_id) {
        return userMapper.queryUserByID(user_id);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
