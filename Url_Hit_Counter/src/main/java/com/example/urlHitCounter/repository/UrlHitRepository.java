package com.example.urlHitCounter.repository;

import com.example.urlHitCounter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlHitRepository {

    @Autowired
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }
}
