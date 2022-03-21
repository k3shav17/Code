package com.empl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IdNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 2220153064428417309L;

	@ExceptionHandler(value = IdNotFoundException.class)
	public ResponseEntity<Object> idNotfound(IdNotFoundException exception) {

		return new ResponseEntity<>("Id does not exists.", HttpStatus.NOT_FOUND);
	}

}
