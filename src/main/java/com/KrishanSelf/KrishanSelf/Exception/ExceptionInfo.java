package com.KrishanSelf.KrishanSelf.Exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ExceptionInfo
{
    private String message;

    private HttpStatus httpStatus;

    private ZonedDateTime zonedDateTime;

    public ExceptionInfo(String message, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }
}
