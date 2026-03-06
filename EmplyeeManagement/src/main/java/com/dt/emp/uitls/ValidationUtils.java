package com.dt.emp.uitls;

import java.util.regex.Pattern;

public class ValidationUtils {
    private static final Pattern EMAIL_PATTERN=Pattern.compile("[A-Za-z0-9+_.-]+@(.+)$");
    private ValidationUtils(){}

    public static boolean isValidemail(String email){
        if(email == null){
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
    public static boolean isNotEmpty(String value){
        return value != null && !value.trim().isEmpty();
    }
}
