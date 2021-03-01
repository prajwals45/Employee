package com.example.flipzone.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {

    @Id
    @Column(name = "employee_id")
    String employee_id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "team_id")
    Team emp_team;

    @NotNull
    @Column(name = "first_name")
    String first_name;

    @NotNull
    @Column(name = "last_name")
    String last_name;

    @NotNull
    @Column(name = "address")
    String address;

    @Email(message = "{user.email.invalid}")
    @NotEmpty(message = "Please enter email")
    @Column(name = "email")
    String email;

    @NotNull
    @Column(name = "contact_number")
    long contact_number;

    @NotNull
    @Column(name = "age")
    int age;

    @ManyToMany
        @JoinTable( name = "employee_product_mapping",
                joinColumns = @JoinColumn(name = "employee_id"),
                inverseJoinColumns = @JoinColumn(name = "product_id"))
    List<Product> emp_products;


//    @NotNull
//    @Column(name = "dob")
//    @Temporal(TemporalType.DATE)
//    Date dob;


    public Employee(){}

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Team getTeam() {
        return emp_team;
    }

    public void setTeam(Team team) {
        this.emp_team = team;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact_number() {
        return contact_number;
    }

    public void setContact_number(long contact_number) {
        this.contact_number = contact_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Product> getProducts() {
        return emp_products;
    }

    public void setProducts(List<Product> products) {
        this.emp_products = products;
    }

//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//    public Team getEmp_team() {
//        return emp_team;
//    }

    public void setEmp_team(Team emp_team) {
        this.emp_team = emp_team;
    }

    public List<Product> getEmp_products() {
        return emp_products;
    }

    public void setEmp_products(List<Product> emp_products) {
        this.emp_products = emp_products;
    }


}

