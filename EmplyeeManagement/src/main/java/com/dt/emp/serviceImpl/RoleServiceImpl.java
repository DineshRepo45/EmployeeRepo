package com.dt.emp.serviceImpl;

import com.dt.emp.Exception.ResourceNotFoundException;
import com.dt.emp.dto.request.RoleRequest;
import com.dt.emp.dto.response.RoleResponse;
import com.dt.emp.entity.Role;
import com.dt.emp.mapper.RoleMapper;
import com.dt.emp.repository.RoleRepository;
import com.dt.emp.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    @Autowired
    private final RoleRepository roleRepository;
    @Autowired
    private final RoleMapper roleMapper;
    @Override
    public RoleResponse createRole(RoleRequest dto) {
        Role role =roleMapper.toEntity(dto);
        return roleMapper.toDto(roleRepository.save(role));
    }

    @Override
    public RoleResponse updateRole(Long id,RoleRequest dto) {
        Role role=roleRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Role Not found"));
        role.setName(dto.getName());
        role.setDescription(dto.getDescription());
        return roleMapper.toDto(roleRepository.save(role));
    }

    @Override
    public RoleResponse getRoleById(Long Id) {
        Role role=roleRepository.findById(Id).orElseThrow(()->new ResourceNotFoundException("Role not found"));
        return  roleMapper.toDto(role);
    }

    @Override
    public List<RoleResponse> getAllRoles() {
        return roleRepository.findAll()
                .stream()
                .map(roleMapper :: toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteRole(Long Id) {
 roleRepository.deleteById(Id);
    }
}
