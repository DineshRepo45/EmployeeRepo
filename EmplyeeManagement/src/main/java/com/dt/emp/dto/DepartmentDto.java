package com.dt.emp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentDto {
    private Long id;

    @NotBlank(message = "Department name is required")
    private String name;

    private String description;
}
