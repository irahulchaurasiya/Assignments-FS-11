package com.Ecommerce.eCommerce.service;

import com.Ecommerce.eCommerce.model.User;
import com.Ecommerce.eCommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Integer id) {
        return  userRepository.findUserById(id);
    }
}