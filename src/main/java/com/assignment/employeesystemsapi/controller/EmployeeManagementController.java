package com.assignment.employeesystemsapi.controller;

import com.assignment.employeesystemsapi.model.Employee;
import com.assignment.employeesystemsapi.model.SignUp;
import com.assignment.employeesystemsapi.services.EmployeeManagementService;
import com.assignment.employeesystemsapi.services.SignUpManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeManagementController {
    private final EmployeeManagementService employeeManagementService;

    public EmployeeManagementController(EmployeeManagementService employeeManagementService) {
        this.employeeManagementService = employeeManagementService;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
    return employeeManagementService.createEmployee(employee);
    }



    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeManagementService.getAllEmployees();
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id)
    {
     boolean deleted=false;
   deleted=employeeManagementService.deleteEmployee(id);
    Map<String,Boolean> response= new HashMap<>();
   response.put("deleted",deleted);
    return ResponseEntity.ok(response);
    }
//getting the emp record wth the corresponding id from the db
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id)
    {
        Employee employee=null;
        employee=employeeManagementService.getEmployeeById(id);
return ResponseEntity.ok(employee);
    }
//method for updating the emp record
   @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee)
    {
employee=employeeManagementService.updateEmployee(id,employee);
return ResponseEntity.ok(employee);
    }
}
