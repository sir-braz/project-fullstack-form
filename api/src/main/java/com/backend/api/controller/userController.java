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

    }

    @GetMapping(value = "/api/users")
    public ResponseEntity<List<User>> listAllUsers(){

    }

    @GetMapping(value = "/api/users/{id}")
    public ResponseEntity<List<User>> listUserWithId(@PathVariable Long userId){

    }

    @DeleteMapping(value = "/api/users/{id}")

    @PutMapping(value = "/api/users/{id}")
}
