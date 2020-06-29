package com.example.demo.appconfig;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.example.demo.models.UserModel;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//Implementing user details service;
public class MyUserDetails implements UserDetails {

    private UserModel userModel;


    public MyUserDetails(UserModel userModel){
        this.userModel=userModel;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority=new SimpleGrantedAuthority(userModel.getUser_roles());
        return Arrays.asList(authority);
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return userModel.getUser_password();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return userModel.getUser_name();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }
    
}