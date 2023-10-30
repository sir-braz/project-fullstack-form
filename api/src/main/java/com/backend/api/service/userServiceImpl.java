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
        try{

        }catch (BackendException ex){
            throw new BackendException("Error to get user by id");
        }
    }

    @Override
    public void deleteUserById(Long userId) {
        try{

        }catch (BackendException ex){
            throw new BackendException("Error to delete user with id");
        }
    }

    @Override
    public void updateUser(User user, Long userId) {
        try{

        }catch (BackendException ex){
            throw new BackendException("Error to update user with id");
        }
    }
}
