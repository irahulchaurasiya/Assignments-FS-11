package com.example.urlHitCounter.controller;

import com.example.urlHitCounter.model.User;
import com.example.urlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    public UrlHitService urlHitService;
    @GetMapping("count")
    public String getHitCount() {
        return urlHitService.getHitCount();
    }

    @GetMapping("username/{userName}/count")
    public String getUserHitCount(@PathVariable String userName)
    {
        return urlHitService.getUserHitCount(userName);
    }

    @GetMapping("allUsers")
    public List<User> getUserList()
    {
        return urlHitService.getUserList();
    }
}