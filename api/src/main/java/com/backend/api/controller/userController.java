package com.backend.api.controller;

import com.backend.api.entity.User;
import com.backend.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

        }catch (){

        }
    }

    @GetMapping(value = "/api/users")
    public ResponseEntity<List<User>> listAllUsers(){
        try{

        }catch (){

        }
    }

    @GetMapping(value = "/api/users/{id}")
    public ResponseEntity<List<User>> listUserWithId(@PathVariable Long userId){
        try{

        }catch (){

        }
    }

    @DeleteMapping(value = "/api/users/{id}")
    public ResponseEntity<User> deleteUserWithId(@PathVariable Long userId){
        try{

        }catch (){

        }
    }
    @PutMapping(value = "/api/users/{id}")
    public ResponseEntity<User> updateUserWithId(@RequestBody User user, @PathVariable Long userId) {
        try{

        }catch (){

        }
    }
}
