package com.assignment.employeesystemsapi.repository;

import com.assignment.employeesystemsapi.entity.SignupManagementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpManagementRepo extends JpaRepository<SignupManagementEntity, Long> {

}
