package com.dt.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
//@EnableMethodSecurity
public class EmployeeManagmentApplication {
    public static void main(String[] args) {

        SpringApplication.run(EmployeeManagmentApplication.class,args);
    }
}
