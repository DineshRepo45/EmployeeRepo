package com.dt.emp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Employee extends Base {
    @Column(nullable = false)
    private String employeeCode;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false,unique = true)
    private String email;

    private String mobileNo;

    private LocalDate dateOfBirth;

    private String gender;

    private LocalDate hireDate;

    private BigDecimal salary;

    private String status;

    //Relationaship
    @ManyToOne
    @JoinColumn(name = "department_id")
     private Department department;

    @ManyToOne
    @JoinColumn(name = "role_id")
     private Role role;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
     private Address address;
}
