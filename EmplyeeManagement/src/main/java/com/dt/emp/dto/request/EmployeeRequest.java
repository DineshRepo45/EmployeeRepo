package com.dt.emp.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class EmployeeRequest {
    @NotBlank
    private String employeeCode;

    @NotBlank
    private String firstName;

    private String lastName;

    @Email
    private String email;

    private String mobileNo;

    private LocalDate dateOfBirth;

    private String gender;

    private LocalDate hireDate;

    private BigDecimal salary;

    private String status;

    private Long departmentId;

    private Long roleId;

    private AddressRequest address;

}
