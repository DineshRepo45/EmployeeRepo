package com.dt.emp.service;

import com.dt.emp.dto.request.EmployeeRequest;
import com.dt.emp.dto.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    EmployeeResponse createEmployee(EmployeeRequest dto);
    EmployeeResponse updateEmployee(Long id,EmployeeRequest dto);
    EmployeeResponse getEmployeeById(Long id);
    List<EmployeeResponse> getAllEmployees();
    void deleteEmployee(Long id);
}
