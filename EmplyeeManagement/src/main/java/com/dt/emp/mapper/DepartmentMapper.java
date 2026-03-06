package com.dt.emp.mapper;

import com.dt.emp.dto.request.DepartmentRequest;
import com.dt.emp.dto.response.DepartmentResponse;
import com.dt.emp.entity.Department;

public class DepartmentMapper {
    public static Department mapToEntity(DepartmentRequest dto){
        if(dto==null){
            return  null;
        }
        Department department=new Department();
        department.setName(dto.getName());
        department.setDescription(dto.getDescription());
        return  department;
    }
    public static DepartmentResponse toDto(Department department){
        DepartmentResponse dto=new DepartmentResponse();
        if(department==null){
            return null;
        }
        dto.setId(department.getId());
        dto.setName(department.getName());
        return dto;
    }

}
