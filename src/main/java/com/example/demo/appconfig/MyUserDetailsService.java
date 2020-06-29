package com.example.demo.appconfig;

import java.util.Optional;

import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        UserModel user=userRepository.getUser(username);
        if(user==null){
            throw new UsernameNotFoundException("User not found:");
        }
        return new MyUserDetails(user);
    }

}
