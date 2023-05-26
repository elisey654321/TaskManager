package ru.iedev.taskmanager.model.UserTaskManager;

import ru.iedev.taskmanager.model.UserTaskManager.UserTaskManager;

import java.util.List;

public interface UserTaskManagerService{
    void addPerson(UserTaskManager person);
    List<UserTaskManager> getAllUsers();
    UserTaskManager getUserTaskManagerById(int id);
    void updateUserTaskManager(int id);
    void deleteUserTaskManager(int id);
}
