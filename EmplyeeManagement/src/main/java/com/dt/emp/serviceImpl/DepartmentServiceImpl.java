package com.dt.emp.serviceImpl;

import com.dt.emp.Exception.ResourceNotFoundException;
import com.dt.emp.dto.request.DepartmentRequest;
import com.dt.emp.dto.response.DepartmentResponse;
import com.dt.emp.entity.Department;
import com.dt.emp.mapper.DepartmentMapper;
import com.dt.emp.repository.DepartmentRepository;
import com.dt.emp.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private  final DepartmentRepository departmentRepository;
    @Autowired
    private final DepartmentMapper departmentMapper;

    @Override
    public DepartmentResponse createDepartment(DepartmentRequest dto) {
        Department department=departmentMapper.mapToEntity(dto);
        return departmentMapper.toDto(departmentRepository.save(department));
    }

    @Override
    public DepartmentResponse updateDepartment(Long id,DepartmentRequest dto) {
        Department department=departmentRepository.findById(id)
                .orElseThrow(() ->new ResourceNotFoundException("Department not found by this Id "+id));
        department.setName(dto.getName());
        department.setDescription(dto.getDescription());
        return  departmentMapper.toDto(departmentRepository.save(department));
    }

    @Override
    public DepartmentResponse getDepartmentById(Long id) {
        Department department=departmentRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Department not found by this Id "+ id));
        return departmentMapper.toDto(department);
    }

    @Override
    public List<DepartmentResponse> getAlldepartment() {
        return departmentRepository.findAll()
                .stream()
                .map(departmentMapper :: toDto)
                .collect(Collectors.toList()).reversed();
    }

    @Override
    public void deleteDepartment(Long id) {
     departmentRepository.deleteById(id);
    }
}
