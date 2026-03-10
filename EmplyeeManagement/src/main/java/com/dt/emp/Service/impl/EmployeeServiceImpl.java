package com.dt.emp.Service.impl;

import com.dt.emp.Exception.ResourceNotFoundException;
import com.dt.emp.Repository.DepartmentRepository;
import com.dt.emp.Repository.EmployeeRepository;
import com.dt.emp.Repository.RoleRepository;
import com.dt.emp.dto.EmployeeDto;
import com.dt.emp.entity.Department;
import com.dt.emp.entity.Employee;
import com.dt.emp.entity.Role;
import com.dt.emp.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements com.dt.emp.Service.EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final RoleRepository roleRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Department department=departmentRepository.findById(employeeDto.getDepartmentId())
                .orElseThrow(()->new ResourceNotFoundException("Department not found"));
        Role role =roleRepository.findById(employeeDto.getRoleId())
                .orElseThrow(()-> new ResourceNotFoundException("Role not found"));
        Employee employee= EmployeeMapper.toEntity(employeeDto,department,role);
        Employee saveEmployee=employeeRepository.save(employee);
        return  EmployeeMapper.toDto(saveEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee not found"));
        return EmployeeMapper.toDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(EmployeeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto dto) {
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not found"));
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setEmail(dto.getEmail());
        employee.setSalary(dto.getSalary());
        Employee updateEmployee=employeeRepository.save(employee);
        return  EmployeeMapper.toDto(updateEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
      Employee employee=employeeRepository.findById(id)
              .orElseThrow(()->new ResourceNotFoundException("Employee Not Found"));
      employeeRepository.delete(employee);
    }
}
