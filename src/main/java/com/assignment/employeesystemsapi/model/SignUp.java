package com.assignment.employeesystemsapi.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUp {
    private long id;
    private String userName;
    private String password;
    private String emailId;
}

