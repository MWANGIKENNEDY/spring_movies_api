package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplemetation implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(UserModel userModel) {
        userRepository.save(userModel);
    }

}
