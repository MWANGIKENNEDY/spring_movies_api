package com.example.demo.repository;

import java.util.Optional;

import com.example.demo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {

    //Method to search user in db according to username
    public Optional<UserModel> getUser(String userName);

}
