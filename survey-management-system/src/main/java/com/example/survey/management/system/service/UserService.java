package com.example.survey.management.system.service;

import com.example.survey.management.system.model.User;
import com.example.survey.management.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public String signUpUser(User user) {

        String newEmail=user.getUserEmail();
        if(newEmail==null){
            return "inValid email";
        }

        User existingUser=userRepository.findFirstByUserEmail(newEmail);
        if(existingUser!=null){
            return "Email/User is already exist";
        }

        userRepository.save(user);
        return "user signup successfully!!!";
    }

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User getUserByEmail(String userEmail) {
        return userRepository.findByUserEmail(userEmail);
    }
}
