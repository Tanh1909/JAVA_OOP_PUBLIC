package com.example.aop.service;

import com.example.aop.entity.User;
import com.example.aop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {
     User createUser(User user);
     User getUser(Long userId);
}
