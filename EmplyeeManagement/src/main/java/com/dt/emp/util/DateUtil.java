package com.dt.emp.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static  final DateTimeFormatter FORMATTER=DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public  static String formatDate(LocalDate date){
        return date.format(FORMATTER);
    }
    public static  LocalDate parsedate(String date){
        return  LocalDate.parse(date,FORMATTER);
    }
}
