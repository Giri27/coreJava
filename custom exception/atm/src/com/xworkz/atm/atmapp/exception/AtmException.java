package com.xworkz.atm.atmapp.exception;


//custom unchecked exception
public class AtmException extends RuntimeException{
	
	public String getMessage() {
		
		return "Enter valid amount";
	}

}
