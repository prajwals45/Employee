package com.example.flipzone.service;

import com.example.flipzone.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

     List<Employee> getAllEmployees();

    Employee addEmployee(Employee emp);

    Optional<Employee> findEmployeeById(String empid);

   List<Employee> getAllEmployeesByTeamId(String tid);

//   List<Employee> getAllEmployeesByProductId(String pid);
}
