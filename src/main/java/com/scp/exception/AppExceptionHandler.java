package com.scp.exception;

import org.springframework.core.env.AbstractEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handlerException(Exception exception){

       ErrorResponse errorResponse = ErrorResponse.builder()
               .message(exception.getMessage())
               .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString())
               .time(LocalDateTime.now().toString())
               .build();

       return errorResponse;

    }
}
