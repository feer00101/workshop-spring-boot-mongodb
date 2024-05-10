package com.nilofer.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilofer.workshopmongo.domain.User;
import com.nilofer.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired(required = true)
    private UserRepository repo;

    public List<User> findAll() {

        return repo.findAll();

    }
}