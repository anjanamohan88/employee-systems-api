package com.assignment.employeesystemsapi.repository;

import com.assignment.employeesystemsapi.entity.EmployeeManagementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeManagementRepo extends JpaRepository<EmployeeManagementEntity, Long> {
}
