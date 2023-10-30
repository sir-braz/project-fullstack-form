package com.backend.api.controller;

import com.backend.api.entity.User;
import com.backend.api.service.UserService;
import com.backend.api.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
    public ResponseEntity<List<User>> listUserWithId(@PathVariable Long userId){
        try{

        }catch (BackendException ex){

        }
    }

    @DeleteMapping(value = "/api/users/{id}")
    public ResponseEntity<User> deleteUserWithId(@PathVariable Long userId){
        try{

        }catch (BackendException ex){

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
