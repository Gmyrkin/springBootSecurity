package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.service;//package com.example.education_3_1_1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model.User;
import ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByFirstName(username).orElseThrow(
                () -> (new UsernameNotFoundException("User not found"))
        );

        return user;
    }
}

