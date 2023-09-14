package com.example.userManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    ArrayList<User> userList = new ArrayList<>();

    @PostMapping("addUser")
    public String addUser(@RequestBody User user)
    {
        userList.add(user);
        return "User Added!!!";
    }

    @GetMapping("getAllUser")
    public List<User> getAllUser()
    {
        return userList;
    }

    @GetMapping("getUser/{id}")
    public Object getUserById(@PathVariable Long id)
    {
        for(User user : userList)
        {
            if (user.getUserId().equals(id))
            {
                return user;
            }
        }
        return "User "+ id + " Not Found";
    }

    @PutMapping("updateUserInfo/{id}")
    public String updateUser(@PathVariable Long id , @RequestBody User updatedUser)
    {
        for(User user : userList)
        {
            if (user.getUserId().equals(id))
            {
                user.setName(updatedUser.getName());
                user.setUserName(updatedUser.getUserName());
                user.setUserAddress(updatedUser.getUserAddress());
                user.setUserNumber(updatedUser.getUserNumber());

                return "User " + id + " updated";
            }
        }
        return "User with " + id + " doesn't exist!!!";
    }

    @DeleteMapping("deleteUser")
    public String deleteUser(@RequestParam Long id)
    {
        for(User user : userList)
        {
            if (user.getUserId().equals(id))
            {
                userList.remove(user);
                return "User " + id + " Deleted!!!";
            }
        }
        return "User with " + id + " doesn't exist!!!";
    }
}
