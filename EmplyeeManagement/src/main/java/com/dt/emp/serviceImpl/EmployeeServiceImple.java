package com.dt.emp.serviceImpl;

import com.dt.emp.Exception.ResourceNotFoundException;
import com.dt.emp.dto.request.EmployeeRequest;
import com.dt.emp.dto.response.EmployeeResponse;
import com.dt.emp.entity.Employee;
import com.dt.emp.mapper.EmployeeMapper;
import com.dt.emp.repository.EmployeeRepository;
import com.dt.emp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImple implements EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeResponse createEmployee(EmployeeRequest dto) {
        Employee employee=employeeMapper.mapToEntity(dto);
        Employee saveEmployee =employeeRepository.save(employee);
        return  employeeMapper.mapToResponse(saveEmployee);
    }

    @Override
    public EmployeeResponse updateEmployee(Long id, EmployeeRequest dto){
        Employee employee =employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee Not found with id:-"+ id));
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setEmail(dto.getEmail());
        employee.setEmployeeCode(dto.getEmployeeCode());
        employee.setGender(dto.getGender());
        employee.setMobileNo(dto.getMobileNo());
        employee.setSalary(dto.getSalary());

        Employee updatedEmployee = employeeRepository.save(employee);
        return employeeMapper.mapToResponse(updatedEmployee);
    }

    @Override
    public EmployeeResponse getEmployeeById(Long id) {
       Employee employee=employeeRepository.findById(id)
               .orElseThrow(()->new ResourceNotFoundException("Employee not found with id :-"+id));
       return employeeMapper.mapToResponse(employee);
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        List<Employee> employees=employeeRepository.findAll();
        return  employees.stream()
                .map(employeeMapper::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteEmployee(Long id) {
Employee employee=employeeRepository.findById(id)
        .orElseThrow(( )->new ResourceNotFoundException("Employee not found with id :- "+id));
     employeeRepository.delete(employee);
    }
}
