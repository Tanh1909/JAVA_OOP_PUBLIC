package com.example.aop.controller;

import com.example.aop.entity.User;
import com.example.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("")
    public ResponseEntity<?> createUser(){
        User user=new User();
        user.setUsername("tanh1909");
        user.setPassword("12345");
        user.setEmail(("dtienanh1909@gmail.com"));
        return ResponseEntity.ok(userService.createUser(user));
    }
    @GetMapping("/{userId}")
    public ResponseEntity<?> findById(@PathVariable Long userId){
        return ResponseEntity.ok(userService.getUser(userId));
    }
}
