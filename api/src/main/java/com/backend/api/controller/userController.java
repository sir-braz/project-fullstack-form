package com.backend.api.controller;

import com.backend.api.entity.User;
import com.backend.api.service.UserService;
import com.backend.api.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@Service
public class userController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @PostMapping(value = "/api/register")
    public ResponseEntity<String> createUser(@RequestBody User user){
        try{
            userService.save(user);
            return ResponseEntity.ok("Create user successfully");
        }catch (BackendException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to create users");
        }
    }

    @GetMapping(value = "/api/users")
    public ResponseEntity<String> listAllUsers(){
        try{
            List<User> users = userService.getAllUsers();
            return ResponseEntity.ok("Get All Users successfully");
        }catch (BackendException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to get all users");
        }
    }

    @GetMapping(value = "/api/users/{id}")
    public ResponseEntity<String> listUserWithId(@PathVariable Long userId){
        try{
            return ResponseEntity.ok("Get user with id successfully");
        }catch (BackendException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to get user with id");
        }
    }

    @DeleteMapping(value = "/api/users/{id}")
    public ResponseEntity<String> deleteUserWithId(@PathVariable Long userId){
        try{
            return ResponseEntity.ok("Delete user with id sucessfully");
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to delete user with id");
        }
    }
    @PutMapping(value = "/api/users/{id}")
    public ResponseEntity<String> updateUserWithId(@RequestBody User user, @PathVariable Long userId) {
        try{
            return ResponseEntity.ok("Update with id successfully");
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to update user with id");
        }
    }
}
