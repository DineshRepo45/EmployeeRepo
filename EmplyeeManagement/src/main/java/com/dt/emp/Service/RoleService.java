package com.dt.emp.Service;

import com.dt.emp.entity.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    List<Role>getAllRole();
}
