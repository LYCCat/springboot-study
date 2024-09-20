package com.example.access_count_.service;

import com.example.access_count_.mapper.AccessCountMapper;
import com.example.access_count_.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccessCountService {
    @Autowired
    AccessCountMapper accessCountMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    public void register(User user){

        //psd BCrypt加密

        //保存


    }
    public User login(){

    }

}

