package com.KrishanSelf.KrishanSelf.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ExceptionController
{
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Object> StudentNotFound(StudentNotFoundException stuexp)
    {
        ExceptionInfo Info = new ExceptionInfo(stuexp.getMessage(), HttpStatus.NOT_FOUND, ZonedDateTime.now());
        return new ResponseEntity(Info,new HttpHeaders(),HttpStatus.NOT_FOUND);
    }
}
