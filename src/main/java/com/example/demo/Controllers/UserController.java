package com.example.demo.Controllers;

import com.example.demo.Models.User;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
 public class UserController {
    @Autowired
    private UserService userService ;

    @GetMapping("/showusers")
    public List<User> findusers( ) {

        var users = (List<User>) userService.findAll();

        return users ;
    }
    @PostMapping("/adduser")
    public User createuser(@RequestBody User user){
        userService.adduser(user);
        return user ;
    }
    @DeleteMapping("/deleteuser/{id}")
    public void deleteuser(@PathVariable Long id ){
        userService.deleteuser(id);

    }





}
