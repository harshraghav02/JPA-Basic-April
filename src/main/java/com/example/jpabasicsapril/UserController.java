package com.example.jpabasicsapril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addingUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getUser")
    public User getUserById(@RequestParam("Id") int id){
        return userService.getUser(id);
    }

    @DeleteMapping("/deleteAllUser")
    public String deleteAllUsers(){
        return userService.deleteUsers();
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id){
        return userService.deleteParticularUser(id);
    }

    @PutMapping("/updateUserName")
    public String updateUser(@RequestParam("id") Integer id,@RequestParam("name") String name){
        return userService.updateUser(id,name);
    }
}
