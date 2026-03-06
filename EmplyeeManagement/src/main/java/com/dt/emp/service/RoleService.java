package com.dt.emp.service;

import com.dt.emp.dto.request.RoleRequest;
import com.dt.emp.dto.response.RoleResponse;

import java.util.List;

public interface RoleService {
    RoleResponse createRole(RoleRequest dto);
    RoleResponse updateRole(Long id,RoleRequest dto);
    RoleResponse getRoleById(Long Id);
    List<RoleResponse> getAllRoles();
    void deleteRole(Long Id);
}
