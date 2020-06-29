package com.example.demo.repository;

import java.util.Optional;

import com.example.demo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserModel,Long> {

    //Method to search user in db according to username
    @Query("select u from user u where u.username=:username")
    public UserModel getUser(@Param("username") String userName);

}
