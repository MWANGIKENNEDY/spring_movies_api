package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplemetation implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(UserModel userModel) {
        userRepository.save(userModel);
    }

    @Override
    public List<UserModel> registeredUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserModel> getUser(Long id) {
        return userRepository.findById(id);
    }


}
