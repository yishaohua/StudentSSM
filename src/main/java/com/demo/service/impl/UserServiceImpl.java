package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.pojo.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;
    public List<User> list() {
        return userMapper.list();
    }
    public void add(User user) {
        userMapper.add(user);
    }
    public void del(int id) {
        userMapper.del(id);
    }
    public void update(User user) {
        userMapper.update(user);
    }
    public User get(int id) {
        return userMapper.get(id);
    }


}