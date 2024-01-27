package com.sbexception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sbexception.exception.NoUserFoundId;

@RestController
public class GlobalExceptionHnadler {

	          @GetMapping("/customer/{name}")
	          public String getCustomer(@PathVariable("name") String name) {
	        	  
	        	  int i=10/0;
	        	  String msg="This application testing for Global Exception:::"+name;
	        	  
	        	  return msg;
	          }
	          @GetMapping("/allcustomer/{name}")
	          public String getCustomerAll( String name) {
	        	  
	        	 
	        	  String msg="This application testing for Global Exception:::"+name.intern();
	        	  
	        	  return msg;
	          }
	          @GetMapping("/customerid/{id}")
	          public String getCustomerAll(@PathVariable("id") int id) throws NoUserFoundId {
	        	  
	        	 
	        	  if(id>100) {
	        		  return "Hello Ravi";
	        	  }else {
	        		  
	        		   throw new NoUserFoundId("Invalid User");
	        	  }
	        	 
	          }
}
