package ru.iedev.taskmanager.model.UserTaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTaskManagerImpl implements UserTaskManagerService {

    UserTaskManagerRepository userTaskManagerRepository;

    @Autowired
    public UserTaskManagerImpl(UserTaskManagerRepository userTaskManagerRepository) {
        this.userTaskManagerRepository = userTaskManagerRepository;
    }

    @Override
    public void addPerson(UserTaskManager person) {

    }

    @Override
    public List<UserTaskManager> getAllUsers() {
        return null;
    }

    @Override
    public UserTaskManager getUserTaskManagerById(int id) {
        return null;
    }

    @Override
    public void updateUserTaskManager(int id) {

    }

    @Override
    public void deleteUserTaskManager(int id) {

    }
}
