package com.backend.api.service;

import com.backend.api.entity.User;
import com.backend.api.utility.BackendException;

import java.util.List;

public class userServiceImpl implements UserService {

    @Override
    public void save(User user) {
        try{

        }catch (Exception ex){
            throw new BackendException("Error to create a new user");
        }
    }

    @Override
    public List<User> getAllUsers() {
        try {

        }catch (Exception ex){
            throw new BackendException("Error to get all users");
        }
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public void deleteUserById(Long userId) {

    }

    @Override
    public void updateUser(User user, Long userId) {

    }
}
