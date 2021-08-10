package com.exception.exceptionEx;

public class NFException {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		try {
			Integer.parseInt("null");
		
		}catch(NumberFormatException nfe) {
			
			System.out.println("input string cannot be null");
		}
		
		try {
			Float.parseFloat("");
		
		}catch(NumberFormatException nfe) {
			
			System.out.println("input string cannot be empty");
		}
		
		try {
			Integer a = new Integer(" 45 ");
		
		}catch(NumberFormatException nfe) {
			
			System.out.println("input string cannot have white spaces");
		}
		
		try {

			Float.parseFloat("9,87");
			
		}catch(NumberFormatException nfe) {
			
			System.out.println("input string cannot have extra synmols");
			nfe.printStackTrace();
		}
		
		System.out.println("main method is ended");
	}

}
