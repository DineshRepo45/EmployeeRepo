package com.dt.emp.mapper;

import com.dt.emp.dto.EmployeeDto;
import com.dt.emp.entity.Department;
import com.dt.emp.entity.Employee;
import com.dt.emp.entity.Role;
import org.springframework.context.annotation.Configuration;


public class EmployeeMapper {
    public static EmployeeDto toDto(Employee employee){
        if(employee==null){
            return null;
        }
        EmployeeDto dto=new EmployeeDto();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setEmail(employee.getEmail());
        dto.setPhoneNumber(employee.getPhoneNumber());
        dto.setDob(employee.getDob());
        dto.setAddress(employee.getAddress());
        dto.setSalary(employee.getSalary());
        dto.setJoiningDate(employee.getJoiningDate());
        dto.setStatus(employee.getStatus());

        if(employee.getDepartment()!=null){
            dto.setDepartmentId(employee.getDepartment().getId());
        }
        if(employee.getRole() != null){
            dto.setRoleId(employee.getRole().getId());
        }
        return  dto;
    }
    public static Employee toEntity(EmployeeDto dto, Department department, Role role){
        if( dto==null){
            return  null;
        }
        Employee employee=new Employee();
        employee.setId(dto.getId());
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setEmail(dto.getEmail());
        employee.setPhoneNumber(dto.getPhoneNumber());
        employee.setDob(dto.getDob());
        employee.setAddress(dto.getAddress());
        employee.setSalary(dto.getSalary());
        employee.setJoiningDate(dto.getJoiningDate());
        employee.setStatus(dto.getStatus());

        employee.setDepartment(department);
        employee.setRole(role);
        return employee;
    }
}
