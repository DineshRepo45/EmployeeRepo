package com.dt.emp.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class EmployeeResponse {
    private Long id;
    private String employeeCode;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNo;
    private LocalDate dateOfBirth;
    private String gender;
    private LocalDate hireDate;
    private BigDecimal salary;
    private String satus;

    private DepartmentResponse department;
    private RoleResponse role;
    private AddressResponse address;
}
