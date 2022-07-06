package com.getarrays.employeemanager.employeeRepo;

import com.getarrays.employeemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//This class extends JPA repository which perform operations like save,find,find all etc..

//The Java Persistence API (JPA) is the standard way of persisting Java objects into relational databases.it contains API for basic CRUD operations

public interface employeeRepo extends JpaRepository<Employee, Long> {
 
 //Since the repo doesn't contain a method like deleteEmployeeById we created a method by passing Id as argument, similarly findemployee.
 void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);

}
