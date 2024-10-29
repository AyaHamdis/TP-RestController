package org.example.tp_restcontroller.controller;

import org.example.tp_restcontroller.model.User;
import org.example.tp_restcontroller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/userById")
    public User getUser(@RequestParam Integer id) {
        User user = userService.getUser(id);
        if(user!= null) {
            return user;
        }
        return null;
    }
    @GetMapping("/Users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @DeleteMapping("/deleteUser")
    public void suppUser(@RequestParam Integer id) {
        userService.suppUser(id);
    }
}
