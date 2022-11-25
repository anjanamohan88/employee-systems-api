package com.assignment.employeesystemsapi.services;

import com.assignment.employeesystemsapi.entity.EmployeeManagementEntity;
import com.assignment.employeesystemsapi.entity.SignupManagementEntity;
import com.assignment.employeesystemsapi.model.Employee;
import com.assignment.employeesystemsapi.model.SignUp;
import com.assignment.employeesystemsapi.repository.EmployeeManagementRepo;
import com.assignment.employeesystemsapi.repository.SignUpManagementRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService{

    private EmployeeManagementRepo employeeManagementRepo;
    private SignUpManagementRepo signUpManagementRepo;
    public EmployeeManagementServiceImpl(EmployeeManagementRepo employeeManagementRepo)
    {
        this.employeeManagementRepo=employeeManagementRepo;
    }
    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeManagementEntity employeeManagementEntity=new EmployeeManagementEntity();
        BeanUtils.copyProperties(employee, employeeManagementEntity);
        employeeManagementRepo.save(employeeManagementEntity);
                return employee;
    }


    @Override
    public boolean deleteEmployee(Long id) {
        EmployeeManagementEntity employeeManagementEntity=employeeManagementRepo.findById(id).get();
        employeeManagementRepo.delete(employeeManagementEntity);
        return true;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        EmployeeManagementEntity employeeManagementEntity=employeeManagementRepo.findById(id).get();
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeManagementEntity,employee);
        return  employee;
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        EmployeeManagementEntity employeeManagementEntity= employeeManagementRepo.findById(id).get();
        employeeManagementEntity.setEmailId(employee.getEmailId());
        employeeManagementEntity.setLastName(employee.getLastName());
        employeeManagementEntity.setFirstName(employee.getFirstName());
        employeeManagementRepo.save(employeeManagementEntity);
        return employee;

    }

    @Override
    public List<Employee> getAllEmployees()
    {
        List<EmployeeManagementEntity> employeeManagementEntities=employeeManagementRepo.findAll();
        List<Employee> employees=employeeManagementEntities.stream().map(employees1-> new Employee(employees1.getId(),employees1.getFirstName(),employees1.getLastName(),employees1.getEmailId())).collect(Collectors.toList());
        return employees;
    }
}
