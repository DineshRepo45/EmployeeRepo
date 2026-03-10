package com.dt.emp.Service.impl;

import com.dt.emp.Repository.DepartmentRepository;
import com.dt.emp.entity.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements com.dt.emp.Service.DepartmentService {
    private final DepartmentRepository departmentRepository;
    @Override
    public Department createDepartment(Department department) {
       return  departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return  departmentRepository.findAll();
    }
}
