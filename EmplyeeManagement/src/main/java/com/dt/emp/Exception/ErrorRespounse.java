package com.dt.emp.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErrorRespounse {
    private LocalDateTime timeStamp;
    private int status;
    private String error;
    private String message;
    private String path;
}
