package com.sbexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalExceptionController {

	     
	          @GetMapping("/demo/{name}")
	          public String getMessage(@PathVariable("name") String name) {
	        	  int i=10/0;
	        	    String msg="Welcome to Exception Handler:::" +name;
	        	    
	        	    return msg;
	          }
	          @ExceptionHandler(value=ArithmeticException.class)
	          public ResponseEntity<String> handleException(Exception ex) {
	        	  
	        	    
	        	    return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR); 
	          }
}
