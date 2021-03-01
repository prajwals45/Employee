package com.example.flipzone.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
@Getter
@Setter
public class Team {
    @Id
    @Column(name = "team_id",columnDefinition="VARCHAR(5)")
    String team_id;

    @Column(name = "team_name")
    String team_name;

    @Column(name = "team_description")
    String team_description;

//    @OneToMany(mappedBy = "emp_team")
//    List<Employee> employees;

    public Team(){}

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_description() {
        return team_description;
    }

    public void setTeam_description(String team_description) {
        this.team_description = team_description;
    }

//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
}
