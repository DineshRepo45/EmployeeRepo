package com.dt.emp.Service;

import com.dt.emp.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long id);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long id,EmployeeDto dto);
    void deleteEmployee(Long id);
}
