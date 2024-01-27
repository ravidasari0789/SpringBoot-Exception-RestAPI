package com.sbexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalExceptionDemoController {

	              @GetMapping("/demoex")
	               public String demo(String name) {
	            	   String msg=name.intern();
	            	   
	            	   return msg;
	               }
	              @ExceptionHandler(value=Exception.class)
		          public ResponseEntity<String> handleException(Exception ex) {
		        	  
		        	    
		        	    return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR); 
		          }
}
