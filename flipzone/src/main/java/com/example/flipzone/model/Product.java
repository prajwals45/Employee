package com.example.flipzone.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    @Id
    @Column(name = "product_id",unique=true,columnDefinition="VARCHAR(5)", nullable = false)
    String product_id;

    @Column(name = "product_name")
    String product_name;

    @Column(name = "product_description")
    String product_description;

    @ManyToMany(mappedBy = "emp_products")
    List<Employee> employees;

//    public void addEmployee(employee employee) {
//        employees.add(employee);
//        employee.getProducts().add(this);
//    }

    public Product(){}

}
