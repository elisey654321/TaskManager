package ru.iedev.taskmanager.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class UserController {
    private final UserRepository repository;

    @Autowired
    public UserController(UserRepository repo) {
        repository = repo;
    }

    @RequestMapping(method = GET, value = "/login")
    public String login() {

        return "home";
    }

}
