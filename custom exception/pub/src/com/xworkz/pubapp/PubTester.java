package com.xworkz.pubapp;

import com.xworkz.pubapp.bouncer.Bouncer;
import com.xworkz.pubapp.exception.PubException;

public class PubTester {
	
	public static void main(String[] args) {
		
		Bouncer bouncer = new Bouncer();
		try {
			bouncer.checkAge(27);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
