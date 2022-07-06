package com.getarrays.employeemanager.employeeRepo;

import com.getarrays.employeemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface employeeRepo extends JpaRepository<Employee, Long> {
 void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

}
