package com.example.demo.controllers;

import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/api/register",method = RequestMethod.POST)
    public ResponseEntity<Object> registerUser(@RequestBody UserModel userModel){
        userService.registerUser(userModel);
        return new ResponseEntity<>("User added.", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/users",method = RequestMethod.GET)
    public ResponseEntity<Object> registeredUsers(){
        return new ResponseEntity<>(userService.registeredUsers(),HttpStatus.OK);
    }

    @RequestMapping(value = "/api/users/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable("id") Long id){
        if(userService.getUser(id).isEmpty()){
            throw new UserNotFoundException();
        }
        return new ResponseEntity<>(userService.getUser(id),HttpStatus.OK);
    }

}
