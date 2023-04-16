package com.example.jpabasicsapril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added successfully";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get(); // find by primary key
        // since there will be exception while finding record so .get() will help to handle those error;
    }

    public String deleteUsers(){
        userRepository.deleteAll();
        return "All Users have been deleted successfully";
    }

    public String deleteParticularUser(int id){
        userRepository.deleteById(id);
        return "User Deleted Successfully";
    }

    public String updateUser(int id,String name){
        User user = userRepository.findById(id).get();
        user.setName(name);
        userRepository.save(user);

        return "User Updated Successfully";
    }
}
