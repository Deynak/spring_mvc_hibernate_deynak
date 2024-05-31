package com.deynak.spring.mvc.tasks;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tasks")
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Size(min = 2, max = 15,message = "you must wright something")
    private String name;

    @Column(name ="details")
    @NotBlank(message = "you must wright something")
    private String details;

    @Column(name = "deadline")
    private String deadline;

    public Tasks() {
    }

    public Tasks(String name, String details, String deadline) {
        this.name = name;
        this.details = details;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
