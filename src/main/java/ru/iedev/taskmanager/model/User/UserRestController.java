package ru.iedev.taskmanager.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    private UserRepository userRepository;

    @Autowired
    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/list")
    public List<User> list(){
        return userRepository.findAll();
    }

    @GetMapping("/user/login")
    public String loginUser(){
        return "userRepository.findAll()";
    }

    @Bean
    public void createdUser(){
        userRepository.saveAll(
                List.of(new User(1,"Test"),
                        new User(2,"Test1"))
        );
    }

}
