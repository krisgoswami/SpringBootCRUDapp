package com.krish.mysqlcrudapp.service;

import com.krish.mysqlcrudapp.entities.User;
import com.krish.mysqlcrudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //POST - create a user
    public User saveUser (User user){
        return repository.save(user);
    }

    //POST save all users
//    public List<User> saveUsers (List<User> users){
//        return repository.saveAll(users);
//    }

    //GET - get all users
    public List<User> getUsers (){
        return repository.findAll();
    }

    //GET - get user by id
    public User getUserById (int id){
        return repository.findById(id).orElse(null);
    }

    //UPDATE
    public User updateUser (User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        assert existingUser != null;
//        existingUser.setId(user.getId());
        existingUser.setFirst_name(user.getFirst_name());
        existingUser.setLast_name(user.getLast_name());
        existingUser.setEmail(user.getEmail());
        existingUser.setGender(user.getGender());
        existingUser.setAddress(user.getAddress());
        return repository.save(existingUser);
    }

    //Delete by id
    public String deleteUser(int id){
        repository.deleteById(id);
        return "user " + id + " removed";
    }

}
