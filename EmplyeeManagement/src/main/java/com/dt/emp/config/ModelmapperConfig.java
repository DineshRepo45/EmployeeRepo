package com.dt.emp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelmapperConfig {
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
