package com.dt.emp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
public class EmployeeDto {
    private  Long id;
    @NotBlank(message = "Employee Name is Not Blank")
    private String firstName;

    private String lastName;
    @Email(message = "Invalid Email format")
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message ="Phone Number is required")
    private String phoneNumber;

    private LocalDate dob;
    @NotNull(message = "Salary is requird")
    private BigDecimal salary;

    private String address;

    private LocalDate joiningDate;

    private String status;

    private Long DepartmentId;

    private Long roleId;
}
