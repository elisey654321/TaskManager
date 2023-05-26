package ru.iedev.taskmanager.model.UserTaskManager;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserTaskManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="firstname")
    private String name;

}
