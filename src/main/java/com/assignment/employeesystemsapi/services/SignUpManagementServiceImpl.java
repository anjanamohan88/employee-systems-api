package com.assignment.employeesystemsapi.services;

import com.assignment.employeesystemsapi.entity.SignupManagementEntity;
import com.assignment.employeesystemsapi.model.SignUp;
import com.assignment.employeesystemsapi.repository.EmployeeManagementRepo;
import com.assignment.employeesystemsapi.repository.SignUpManagementRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class SignUpManagementServiceImpl implements SignUpManagementService{
    private SignUpManagementRepo signUpManagementRepo;
    public SignUpManagementServiceImpl(SignUpManagementRepo signUpManagementRepo)
    {
        this.signUpManagementRepo=signUpManagementRepo;
    }
    @Override
    public SignUp signupEmployees(SignUp signUp) {
        SignupManagementEntity signupManagementEntity=new SignupManagementEntity();
        BeanUtils.copyProperties(signUp, signupManagementEntity);
        signUpManagementRepo.save(signupManagementEntity);
        return signUp;
    }

}
