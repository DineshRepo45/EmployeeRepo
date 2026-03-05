package com.dt.emp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "departments")
public class Department extends Base{
    @Column(nullable = false,unique = true)
    private String name;
    private String description;
    @OneToMany(mappedBy = "department")
    private List<Employee>employees;

}
