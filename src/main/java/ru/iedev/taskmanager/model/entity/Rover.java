package ru.iedev.taskmanager.model.entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Rover {

    @Id
    private Long id;
    private String name;
    private Date landing_date;
    private Date launch_date;
    private String status;
    private Integer max_sol;

    @ManyToOne
    private Rover rover;

}
