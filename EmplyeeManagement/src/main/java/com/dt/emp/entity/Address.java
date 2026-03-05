package com.dt.emp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "addresses")
public class Address extends Base {
    private String strect;
    private String city;
    private String zipcode;
    private String country;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


}
