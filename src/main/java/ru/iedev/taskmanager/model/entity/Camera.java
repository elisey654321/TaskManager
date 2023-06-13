package ru.iedev.taskmanager.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Camera {

    @Id
    private Long id;
    private String name;
    private String full_name;

    @ManyToOne
    private Rover rover;

}
