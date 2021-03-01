package com.example.flipzone.service;

import com.example.flipzone.Repository.EmployeeRepository;
import com.example.flipzone.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() { return employeeRepository.findAll(); }

    public Employee addEmployee(Employee emp){ return employeeRepository.save(emp); }

    public Optional<Employee> findEmployeeById(String empid){ return employeeRepository.findById(empid); }

    public List<Employee> getAllEmployeesByTeamId(String tid) { return employeeRepository.findEmployeesByTeamId(tid); }

//    public List<Employee> getAllEmployeesByProductId(String pid) { return employeeRepository.findEmployeesByproductId(pid); }
}
