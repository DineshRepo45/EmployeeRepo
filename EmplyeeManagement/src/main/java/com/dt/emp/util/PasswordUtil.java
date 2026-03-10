package com.dt.emp.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
    private static  final BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
    public static  String encoderPassword(String password){
        return encoder.encode(password);

    }
    public static boolean matchPassword(String rawPassword,String encodePassword){
        return encoder.matches(rawPassword,encodePassword);
    }
}
