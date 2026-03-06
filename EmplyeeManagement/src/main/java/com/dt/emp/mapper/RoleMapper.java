package com.dt.emp.mapper;

import com.dt.emp.dto.request.RoleRequest;
import com.dt.emp.dto.response.RoleResponse;
import com.dt.emp.entity.Role;

public class RoleMapper {
    public static Role toEntity(RoleRequest dto){
        if(dto==null){
            return null;
        }
        Role role=new Role();
        role.setName(dto.getName());
        role.setDescription(dto.getDescription());
        return role;
    }
    public static RoleResponse toDto(Role role){
        if(role==null)
            return null;

        RoleResponse dto=new RoleResponse();
        dto.setId(role.getId());
        dto.setDescription(role.getDescription());
        dto.setName(role.getName());
        return dto;

    }

}
