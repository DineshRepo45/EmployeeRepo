package com.dt.emp.uitls;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class DateTimeUtil {
    private static final String DEFAULT_FORMAT="yyyy-MM-dd HH:mm:ss";
    private DateTimeUtil(){}

    public static String format(LocalDateTime dateTime){
        if(dateTime==null){
            return  null;
        }
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(DEFAULT_FORMAT);
        return dateTime.format(formatter);
    }
    public static  LocalDateTime parse(String date){
        if(date==null || date.isEmpty()){
            return null;
        }
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(DEFAULT_FORMAT);
        return  LocalDateTime.parse(date,formatter);
    }
    public static LocalDateTime now(){
        return LocalDateTime.now();
    }

}
