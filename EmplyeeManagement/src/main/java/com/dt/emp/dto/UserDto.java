package com.dt.emp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private Long id;

    @NotBlank(message = "user name is mandetory")
    private String username;

    @NotBlank(message ="Password is required")
    private String password;

    private String role;
}
