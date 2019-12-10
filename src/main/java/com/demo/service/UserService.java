package com.demo.service;

import com.demo.pojo.User;

import java.util.List;

public interface UserService {

    List<User> list();
    void del(int id);
    void update(User user);
    void add(User user);
    User get(int id);

}