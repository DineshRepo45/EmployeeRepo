package com.dt.emp.mapper;

import com.dt.emp.dto.RoleDto;
import com.dt.emp.entity.Role;

public class RoleMapper {
    public static RoleDto mapToDto(Role role){
        if(role==null){
            return null;
        }
        RoleDto dto=new RoleDto();
        dto.setId(role.getId());
        dto.setName(role.getName());
        return dto;
    }
    public static Role mapToEntity(RoleDto dto){
        if(dto==null){
            return  null;
        }
        Role role=new Role();
        role.setId(dto.getId());
        role.setName(dto.getName());
        return  role;
    }
}
