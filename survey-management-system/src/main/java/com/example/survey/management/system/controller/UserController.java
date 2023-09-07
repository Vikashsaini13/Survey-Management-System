package com.example.survey.management.system.controller;

import com.example.survey.management.system.model.User;
import com.example.survey.management.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("user")
    public String signUpUser(@RequestBody User user){
       return userService.signUpUser(user);
    }

    //get user bu id
    @GetMapping("user/userid/{userId}")
    public User getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }


    //get user by email (using custom finder)
    @GetMapping("user/{userEmail}")
    public User getUserByEmail(@PathVariable String userEmail){
        return userService.getUserByEmail(userEmail);
    }
}
