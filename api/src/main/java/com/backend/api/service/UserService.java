package com.backend.api.service;

import com.backend.api.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);

    void deleteUserById(Long userId);
}
