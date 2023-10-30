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
    public ResponseEntity<User> createUser(@RequestBody User user){
        try{

        }catch (BackendException ex){

        }
    }

    @GetMapping(value = "/api/users")
    public ResponseEntity<List<User>> listAllUsers(){
        try{

        }catch (BackendException ex){

        }
    }

    @GetMapping(value = "/api/users/{id}")
    public ResponseEntity<String> listUserWithId(@PathVariable Long userId){
        try{
            return ResponseEntity.ok("Get user with id successfully");
        }catch (BackendException ex){

        }
        return null;
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
            return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to update user with id");
        }
    }
}
