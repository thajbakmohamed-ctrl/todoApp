package com.example.todoApp.service;

import com.example.todoApp.model.User;
import com.example.todoApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository= userRepository;
    }
    public User  registerUser (User userObject){
        return userRepository.save(userObject);
    }
}
