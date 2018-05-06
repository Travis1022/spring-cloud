package com.txw.controller;

import com.txw.dao.UserRepository;
import com.txw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by txw on 2018/5/6.
 */

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping({"/{id}"})
    public Optional<User> findById(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }
}
