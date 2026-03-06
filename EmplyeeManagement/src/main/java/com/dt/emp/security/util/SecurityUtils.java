package com.dt.emp.security.util;

import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {
    private SecurityUtils(){}
    public static String getLoggedInUser(){
        return SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName();
    }
}
