package com.example.demo.Services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo ;
    public List<User> findAll() {

        List<User> users = new ArrayList<>();
        userRepo.findAll().forEach(users::add); //fun with Java 8

        return users;
    }
    public  User adduser(User user) {
        userRepo.save(user);
        return user;

    }
    public void deleteuser(Long id){
        userRepo.deleteById(id);
    }
}
