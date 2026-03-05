package com.dt.emp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role  extends Base{
    @Column(nullable = false,unique = false)
    private String name;
    private String description;
    @OneToMany(mappedBy = "role")
    private List<Employee> employees;
}
