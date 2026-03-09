package com.dt.emp.mapper;

import com.dt.emp.dto.UserDto;
import com.dt.emp.entity.User;

public class UserMapper {
    public static UserDto mapToDto(User user){
        if(user==null){
            return null;
        }
        UserDto dto= new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());
        return dto;
    }
    public static User mapToEntity(UserDto dto){
        if(dto==null){
            return null;
        }
        User user=new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        return  user;
    }
}
