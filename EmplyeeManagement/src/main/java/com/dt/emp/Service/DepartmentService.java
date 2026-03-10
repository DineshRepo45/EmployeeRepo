package com.dt.emp.Service;

import com.dt.emp.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);
    List<Department> getAllDepartment();
}
