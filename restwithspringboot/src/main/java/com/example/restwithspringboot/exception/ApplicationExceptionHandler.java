package com.example.restwithspringboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler(value = {Exception.class})
	public void handleAnyException(Exception ex)
	{	
		System.out.println(ex);
	}
}
