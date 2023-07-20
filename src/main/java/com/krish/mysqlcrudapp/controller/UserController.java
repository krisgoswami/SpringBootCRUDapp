package com.krish.mysqlcrudapp.controller;

import com.krish.mysqlcrudapp.entities.User;
import com.krish.mysqlcrudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser (@RequestBody User user){
        return service.saveUser(user);
    }

//    @PostMapping("/addUsers")
//    public List<User> addUsers (@RequestBody List<User> users){
//        return service.saveUsers(users);
//    }

    @GetMapping("/users")
    public List<User> findAllUsers (){
        return service.getUsers();
    }

    @GetMapping("user/{id}")
    public User findUserById (@PathVariable int id){
        return service.getUserById(id);
    }

//    @PutMapping ("update")
//    public User updateUser (@RequestBody User user) {
//        return service.updateUser(user);
//    }

    @PutMapping ("updateUser/{id}")
    public User updateUser (@PathVariable int id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    @DeleteMapping ("deleteUser/{id}")
    public String deleteUser (@PathVariable int id){
        return service.deleteUser(id);
    }
}
