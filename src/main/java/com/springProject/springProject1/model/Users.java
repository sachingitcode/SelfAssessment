package com.springProject.springProject1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity(name = "user")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String name;
    private String password;


}
