//Resource is an interface in Spring.This class helps in accessing all the resources
//This class contain all the operation related to database and service layer.

package com.getarrays.employeemanager;

import com.getarrays.employeemanager.model.Employee;
import com.getarrays.employeemanager.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//We need a controller so that can access the service and respond to the requests fro client
@RestController

//We are giving the class a base url
@RequestMapping("/employee")

public class EmployeeResource {

    private final EmployeeService employeeService;
    
    //Injecting the functionalities of EmployeeService
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    //If the base url contains "/all" it means get request, which is to get info of all the employees
    //ResponseEntity represents the whole HTTP response: status code, headers, and body. it is of type generic
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getALlEmployees()
    {
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    //If the base url contains "/find/{id}" it means get request, which is to get info of a particular employee
    //@PathVariable takes the id in the url to get the info of that particular employee
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id)
    {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    //This is to add. The request body is used to send and receive data via the REST API
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    
    //Deleting the info of a particular employee
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id)
    {
         employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
