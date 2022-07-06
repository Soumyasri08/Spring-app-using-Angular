package com.getarrays.employeemanager.service;

import com.getarrays.employeemanager.Exception.UserNotFoundException;
import com.getarrays.employeemanager.employeeRepo.employeeRepo;
import com.getarrays.employeemanager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

//Service Components are the class file which contains @Service annotation. 
//These class files are used to write business logic in a different layer, separated from @RestController class file.
@Service

//The transactional annotation defines the scope of a single database transaction. The database transaction happens inside the scope of a persistence context.

@Transactional
public class EmployeeService {
    private final employeeRepo employeerepo;
    
  //Calling all the functionalities of a repo
    @Autowired
    public EmployeeService(employeeRepo employeerepo)
    {

        this.employeerepo = employeerepo;
    }

    //save(),findall() are built-in functions of JPA repo
    
    
    //performing an add operation
    public Employee addEmployee(Employee employee)
    {
        //Employee code will be generated randomly which is an UUID
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeerepo.save(employee);
    }

    //retrieve the info of all the employees
    public List<Employee> findAllEmployees()
    {

        return employeerepo.findAll();
    }

    //Performing an update and saving it.
    public Employee updateEmployee(Employee employee)
    {

        return employeerepo.save(employee); 
    }

    //Finding an employee by id which isn't a built-in function of JPA repo
    public Employee findEmployeeById(Long id)
    {
        return employeerepo.findEmployeeById(id).
                orElseThrow(()-> new UserNotFoundException("User by id"+id+"is not found"));
    }
    
    //Deleting an employee by id which is also not a built in so we created a method in repo class
    public void deleteEmployee(Long id)
    {
        employeerepo.deleteEmployeeById(id);
    }


}
