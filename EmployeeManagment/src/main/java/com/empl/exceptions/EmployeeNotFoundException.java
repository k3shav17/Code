package com.empl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7976164308036771134L;

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<Object> exceptionFound(EmployeeNotFoundException exception) {

		return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
	}

}

