package com.xworkz.pubapp.bouncer;

import com.xworkz.pubapp.exception.PubException;

public class Bouncer {
	
	public void checkAge(int age) throws PubException {
		
		if(age < 18) {
			
			PubException exception = new PubException();
			throw exception;
		
		} else {
			
			System.out.println("Please enter...enjoyy!!");
		}
	}

}
