package com.xworkz.pubapp.exception;

//Custom checked exception
public class PubException extends Exception{
	
	public String getMessage() {
		
		return "you are too young to enter the pub";
	}

}
