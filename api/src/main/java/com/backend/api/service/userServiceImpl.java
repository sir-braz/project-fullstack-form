package com.backend.api.service;

import com.backend.api.entity.User;
import com.backend.api.repository.UserRepository;
import com.backend.api.utility.BackendException;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class userServiceImpl implements UserService {

    private final UserRepository userRepository;

    public userServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User save(User user) {
        try{
            return userRepository.save(user);
        }catch (Exception ex){
            throw new BackendException("Error to create a new user");
        }
    }

    @Override
    public List<User> getAllUsers() {
        try {
            return (List<User>) userRepository.findAll();
        }catch (Exception ex){
            throw new BackendException("Error to get all users");
        }
    }

    @Override
    public User getUserById(Long userId) {
        try{
            return userRepository.findById(userId).orElse(null);
        }catch (BackendException ex){
            throw new BackendException("Error to get user by id");
        }
    }

    @Override
    public void deleteUserById(Long userId) {
        try{
            userRepository.deleteById(userId);
        }catch (BackendException ex){
            throw new BackendException("Error to delete user with id");
        }
    }

    @Override
    public void updateUser(User user, Long userId) {
        try{
            User existingUser = userRepository.findById(userId).orElse(null);
            if(existingUser != null){
                existingUser.setAddress(user.getAddress());
                existingUser.setChecked(user.isChecked());
                existingUser.setCity(user.getCity());
                existingUser.setEmail(user.getEmail());
                existingUser.setAddress2(user.getAddress2());
                existingUser.setState(user.getState());
                existingUser.setPassword(user.getPassword());
            }
        }catch (BackendException ex){
            throw new BackendException("Error to update user with id");
        }
    }
}
