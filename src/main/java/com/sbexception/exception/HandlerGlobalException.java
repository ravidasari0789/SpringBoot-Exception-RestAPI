package com.sbexception.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerGlobalException {

	           @ExceptionHandler(value=ArithmeticException.class)
	           public ResponseEntity<ExceptionBinding> handlerException(Exception ex){
	        	   ExceptionBinding exception=new ExceptionBinding();
	        	   exception.setErrCode("EXSB0003");
	        	   exception.setErrMessage(ex.getMessage());
	        	   exception.setLdt(LocalDateTime.now());
	        	      return new ResponseEntity<ExceptionBinding>(exception,HttpStatus.INTERNAL_SERVER_ERROR);
	           }
	           @ExceptionHandler(value=NullPointerException.class)
	           public ResponseEntity<ExceptionBinding> handlerNullException(Exception ex){
	        	   
	        	   ExceptionBinding exception=new ExceptionBinding();
	        	   exception.setErrCode("EXSB0004");
	        	   exception.setErrMessage(ex.getMessage());
	        	   exception.setLdt(LocalDateTime.now());
                   return new ResponseEntity<ExceptionBinding>(exception,HttpStatus.INTERNAL_SERVER_ERROR);
	           }
	           @ExceptionHandler(value=NoUserFoundId.class)
	           public ResponseEntity<ExceptionBinding> handlerNoUserException(Exception ex){
	        	   
	        	   ExceptionBinding exception=new ExceptionBinding();
	        	   exception.setErrCode("EXSB0004");
	        	   exception.setErrMessage(ex.getMessage());
	        	   exception.setLdt(LocalDateTime.now());
                   return new ResponseEntity<ExceptionBinding>(exception,HttpStatus.BAD_REQUEST);
	           }
} 
