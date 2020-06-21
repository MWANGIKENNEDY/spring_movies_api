package com.example.demo.services;

import com.example.demo.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public void registerUser(UserModel userModel);
    public List<UserModel> registeredUsers();
    public Optional<UserModel> getUser(Long id);
}
