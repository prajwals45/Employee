package com.example.flipzone.controller;


import com.example.flipzone.Exception.notFoundException;
import com.example.flipzone.model.Employee;
import com.example.flipzone.model.Product;
import com.example.flipzone.model.Team;
import com.example.flipzone.service.EmployeeServiceImpl;
import com.example.flipzone.service.ProductServiceImpl;
import com.example.flipzone.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/")
public class RestController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @Autowired
    private TeamService teamService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees()throws notFoundException {
        List<Employee> emps = employeeServiceImpl.getAllEmployees();
        if(emps.isEmpty())
            throw new notFoundException("Employees not found");
            //todo make new response entity
        return ResponseEntity.ok().body(emps);
    }

    @GetMapping("/employees/{empid}")
    public ResponseEntity<Employee>  getEmployeeById(@PathVariable String empid) throws notFoundException {
            Employee emp = employeeServiceImpl.findEmployeeById(empid).orElseThrow(() -> new notFoundException("Employee not found for this id : " + empid));
            return ResponseEntity.ok().body(emp);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) { return employeeServiceImpl.addEmployee(employee); }


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() throws notFoundException {
        List<Product> prods = productServiceImpl.getAllProducts();
        if(prods.isEmpty())
            throw new notFoundException("Products not found");
        return ResponseEntity.ok().body(prods);
    }

    @GetMapping("/products/{pid}")
    public ResponseEntity<Product> getProductById(@PathVariable String pid) throws notFoundException{
        Product prod = productServiceImpl.findProductById(pid).orElseThrow(() -> new notFoundException("Product not found for this id : " + pid));
        return ResponseEntity.ok().body(prod);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){ return productServiceImpl.addProduct(product); }



    @GetMapping("/teams")
    public ResponseEntity<List<Team>> getAllTeams() throws notFoundException{
        List<Team> tms = teamService.getAllTeams();
        if(tms.isEmpty())
            throw new notFoundException("teams not found");
        return ResponseEntity.ok().body(tms);
    }

    @GetMapping("/teams/{tid}")
    public ResponseEntity<Team> getTeamById(@PathVariable String tid) throws notFoundException{
        Team tm = teamService.findTeamById(tid).orElseThrow(() -> new notFoundException("Team not found for this id : " + tid));
        return ResponseEntity.ok().body(tm);
    }

    @PostMapping("/teams")
    public Team createTeam(@RequestBody Team team){ return teamService.addTeam(team); }


    @GetMapping("/employees/team/{tid}")
    public ResponseEntity<List<Employee>>  getEmployeesByTeamId(@PathVariable String tid) throws notFoundException {
        List<Employee> emp = employeeServiceImpl.getAllEmployeesByTeamId(tid);
//                .orElseThrow(() -> new notFoundException("Employee not found for this Team id : " + tid));
        return ResponseEntity.ok().body(emp);
    }

//    @GetMapping("/employees/product/{pid}")
//    public ResponseEntity<List<Employee>>  getEmployeesByproductId(@PathVariable String pid) throws notFoundException {
//        List<Employee> emp = employeeServiceImpl.getAllEmployeesByProductId(pid);
////                .orElseThrow(() -> new notFoundException("Employee not found for this Team id : " + tid));
//        return ResponseEntity.ok().body(emp);
//    }
}
