package com.example.urlHitCounter.service;

import com.example.urlHitCounter.model.User;
import com.example.urlHitCounter.repository.UrlHitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {

    @Autowired
    UrlHitRepository urlHitRepository;

    public Integer count = 0;
    public String getHitCount() {
        count++;
        return "Visitors : " + count;
    }


    public String getUserHitCount(String userName) {
        List<User> userList = getUserList();
        for(User user : userList)
        {
            if(user.getUserName().equals(userName))
            {
                Integer c = user.getHitCount()+1;
                user.setHitCount(c);
                return "User : " + userName + " , Count : " + c;
            }
        }
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setHitCount(1);
        userList.add(newUser);
        return "User : " + userName +  " , Count : " + newUser.getHitCount();
    }

    public List<User> getUserList() {

        return urlHitRepository.getUserList();
    }
}
