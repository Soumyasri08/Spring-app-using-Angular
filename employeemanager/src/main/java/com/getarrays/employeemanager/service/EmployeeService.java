package com.getarrays.employeemanager.service;

import com.getarrays.employeemanager.Exception.UserNotFoundException;
import com.getarrays.employeemanager.employeeRepo.employeeRepo;
import com.getarrays.employeemanager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final employeeRepo employeerepo;

    @Autowired
    public EmployeeService(employeeRepo employeerepo)
    {

        this.employeerepo = employeerepo;
    }

    public Employee addEmployee(Employee employee)
    {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeerepo.save(employee);
    }

    public List<Employee> findAllEmployees()
    {

        return employeerepo.findAll();
    }

    public Employee updateEmployee(Employee employee)
    {

        return employeerepo.save(employee);
    }

    public Employee findEmployeeById(Long id)
    {
        return employeerepo.findEmployeeById(id).
                orElseThrow(()-> new UserNotFoundException("User by id"+id+"is not found"));
    }
    public void deleteEmployee(Long id)
    {
        employeerepo.deleteEmployeeById(id);
    }


}
