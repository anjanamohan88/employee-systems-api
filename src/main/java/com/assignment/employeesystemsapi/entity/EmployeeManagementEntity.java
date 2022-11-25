package com.assignment.employeesystemsapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "employees")
public class EmployeeManagementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
