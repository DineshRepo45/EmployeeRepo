package com.dt.emp.service;

import com.dt.emp.dto.request.DepartmentRequest;
import com.dt.emp.dto.response.DepartmentResponse;

import java.util.List;

public interface DepartmentService {
    DepartmentResponse createDepartment(DepartmentRequest dto);
    DepartmentResponse updateDepartment(Long id,DepartmentRequest dto);
    DepartmentResponse getDepartmentById(Long id);
    List<DepartmentResponse> getAlldepartment();
    void deleteDepartment(Long id);
}
