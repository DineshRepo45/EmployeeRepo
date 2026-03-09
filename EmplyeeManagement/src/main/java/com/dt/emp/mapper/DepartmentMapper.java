package com.dt.emp.mapper;

import com.dt.emp.dto.DepartmentDto;
import com.dt.emp.dto.EmployeeDto;
import com.dt.emp.entity.Department;
import com.dt.emp.entity.Employee;
import org.springframework.context.annotation.Configuration;


public class DepartmentMapper {
    public static DepartmentDto mapToDto(Department department){
        if( department==null){
            return  null;
        }
        DepartmentDto dto=new DepartmentDto();
        dto.setId(department.getId());
        dto.setName(department.getName());
        dto.setDescription(department.getDescription());
        return  dto;
    }
    public static Department mapToEntity(DepartmentDto dto){
        if(dto==null){
            return  null;
        }

        Department department=new Department();
        department.setId(dto.getId());
        department.setName(dto.getName());
        department.setDescription(department.getDescription());
    }
}
