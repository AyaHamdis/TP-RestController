package org.example.tp_restcontroller.service;

import org.example.tp_restcontroller.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        User user1 = new User(1, "John", "john@example.com");
        User user2 = new User(2, "Jane", "jane@example.com");
        User user3 = new User(3, "Bob", "bob@example.com");
        User user4 = new User(4, "Alice", "alice@example.com");
        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }
    public User getUser(Integer id){
        for(User user: userList)
            if (id== user.getId()){
                return user;
            }
        return null;
    }
    public  void suppUser(Integer id) {
        for (User user : userList)
            if (id == user.getId()) {
                userList.remove(user);
                break;
            }
    }
    public  List<User> getAllUsers() {
        return userList;
    }
}
