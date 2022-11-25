package com.assignment.employeesystemsapi.services;

import com.assignment.employeesystemsapi.model.Employee;
import com.assignment.employeesystemsapi.model.SignUp;

import java.util.List;

public interface EmployeeManagementService {
     List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
