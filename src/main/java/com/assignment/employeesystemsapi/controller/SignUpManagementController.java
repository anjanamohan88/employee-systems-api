package com.assignment.employeesystemsapi.controller;

import com.assignment.employeesystemsapi.model.SignUp;
import com.assignment.employeesystemsapi.services.SignUpManagementService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v2/")

public class SignUpManagementController {

    private final SignUpManagementService signUpManagementService;
    public SignUpManagementController(SignUpManagementService signUpManagementService) {
        this.signUpManagementService = signUpManagementService;
    }

    @PostMapping("/signup")
    public SignUp signupEmployees(@RequestBody SignUp signUp){
        return signUpManagementService.signupEmployees(signUp);
    }
}
