package com.portfolio.portfolio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleException(Exception ex) {
	        return new ResponseEntity<>(
	                ex.getMessage(),
	                HttpStatus.INTERNAL_SERVER_ERROR
	        );
	    }

	    @ExceptionHandler(ResourceNotFoundException.class)
	    public ResponseEntity<String> handleResourceNotFound(
	            ResourceNotFoundException ex) {

	        return new ResponseEntity<>(
	                ex.getMessage(),
	                HttpStatus.NOT_FOUND
	        );
	    }
}
