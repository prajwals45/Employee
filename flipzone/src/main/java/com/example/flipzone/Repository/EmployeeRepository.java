package com.example.flipzone.Repository;

import com.example.flipzone.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query(value ="Select * from Employee Where team_id = :tid",nativeQuery = true)
    List<Employee> findEmployeesByTeamId(String tid);


//    @Query(value ="select e from Employee e join e.emp_products p where p.product_id = :product_id")
//    List<Employee> findEmployeesByproductId(@Param("product_id") String product_id);
}