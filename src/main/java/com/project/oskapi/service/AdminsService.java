package com.project.oskapi.service;

import com.project.oskapi.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AdminsService implements UserDetailsService {
    private final UserRepository adminsRepository;

    public AdminsService(UserRepository adminsRepository){
        this.adminsRepository = adminsRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
