package com.dt.emp.uitls;

import java.util.UUID;

public class IdGeneratorUtil {
    private IdGeneratorUtil(){}

    public static String generateUUID(){
        return UUID.randomUUID().toString();
    }
    public static String generateEmployeeCode(){
        return "EMP :-"+UUID.randomUUID().toString();
    }
}
