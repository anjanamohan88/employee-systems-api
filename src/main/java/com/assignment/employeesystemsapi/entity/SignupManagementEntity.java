package com.assignment.employeesystemsapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "SignUp")
public class SignupManagementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
    private String emailId;
}
