package com.example.userManagementSystem.service;

import com.example.userManagementSystem.model.User;
import com.example.userManagementSystem.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public String addUser(User user) {
        userRepo.save(user);
        return "User Added!!!";
    }

    public List<User> getAllUser() {
        return (List<User>) userRepo.findAll();
    }

    public Object getUserById(Long id) {
        User user = userRepo.findById(id).orElse(null);
        if(user != null)
        {
            return user;
        }
        return "User with id " + id + " not found!!!";
    }

    public String updateUserById(Long id, User user) {
        User existingUser = userRepo.findById(id).orElse(null);
        if (existingUser != null)
        {
            existingUser.setUserName(user.getUserName());
            existingUser.setDateOfBirth(user.getDateOfBirth());
            existingUser.setEmail(user.getEmail());
            existingUser.setPhoneNumber(user.getPhoneNumber());
            existingUser.setDateTime(user.getDateTime());
            userRepo.save(existingUser);
            return "User with id " + id + " updated!!!";
        }
        return "User with id " + id + " not found!!!";
    }

    public String deleteUserById(Long id) {
        User existingUser = userRepo.findById(id).orElse(null);
        if (existingUser != null)
        {
            userRepo.deleteById(id);
            return "User with id " + id + " deleted!!!";
        }
        return "User with id " + id + " not found!!!";
    }
}
