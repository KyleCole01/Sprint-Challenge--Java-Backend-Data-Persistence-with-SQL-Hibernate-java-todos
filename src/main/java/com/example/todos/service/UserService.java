package com.example.todos.service;


import com.example.todos.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findUserByUsername(String username);

    User findUserById(long id);

    void delete(long id);

    User save(User user);

    User update(User user, long id);
}