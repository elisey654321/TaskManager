package ru.iedev.taskmanager.model.UserTaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserTaskManagerController {

    UserTaskManagerRepository userTaskManagerRepository;

    @Autowired
    public UserTaskManagerController(UserTaskManagerRepository userTaskManagerRepository)  {
        this.userTaskManagerRepository = userTaskManagerRepository;
    }

    @RequestMapping("/test")
    public ModelAndView getUsersPage(){
        return new ModelAndView("patients","patients",userTaskManagerRepository.findByName("test"));
    }

}
