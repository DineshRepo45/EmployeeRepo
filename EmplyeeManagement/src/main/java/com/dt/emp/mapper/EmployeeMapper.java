package com.dt.emp.mapper;

import com.dt.emp.dto.request.EmployeeRequest;
import com.dt.emp.dto.response.EmployeeResponse;
import com.dt.emp.entity.Employee;

public class EmployeeMapper {
    public static Employee mapToEntity(EmployeeRequest dto){
        Employee employee=new Employee();
        employee.setEmployeeCode(dto.getEmployeeCode());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setEmail(dto.getEmail());
        employee.setMobileNo(dto.getMobileNo());
        employee.setGender(dto.getGender());
        employee.setDateOfBirth(dto.getDateOfBirth());
        employee.setSalary(dto.getSalary());
        employee.setHireDate(dto.getHireDate());
        employee.setStatus(dto.getStatus());
        return employee;
    }
    public static EmployeeResponse mapToResponse(Employee employee){
        EmployeeResponse dto=new EmployeeResponse();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setEmail(employee.getEmail());
        dto.setSalary(employee.getSalary());
        dto.setHireDate(employee.getHireDate());
        dto.setDateOfBirth(employee.getDateOfBirth());
        dto.setGender(employee.getGender());
        dto.setSatus(employee.getStatus());
        return dto;
    }
}
