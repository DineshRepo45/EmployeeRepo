package com.dt.emp.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse >handleResourceNotFound(ResourceNotFoundException ex){
        ErrorResponse errorResponse=new ErrorResponse(
                ex.getMessage(),ApiErrorCode.RESOURCE_NOT_FOUND.name());
        return  new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ErrorResponse> handleBadRequest(BadRequestException ex){
        ErrorResponse errorResponse= new ErrorResponse(
                ex.getMessage() ,ApiErrorCode.BAD_REQUEST.name()
        );
        return  new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex){
        ErrorResponse error=new ErrorResponse(
                ex.getMessage(), ApiErrorCode.INTERNAL_SERVER_ERROR.name()
        );
        return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
