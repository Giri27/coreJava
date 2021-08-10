package com.exception.exceptionEx;

public class AirthmeticExceptionEx {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		try {
			
			int x = 35;
			int y = 0;
			System.out.println(x/y);
			
		}catch(ArithmeticException ae) {
			
			System.out.println("cannot divide an integer by zero");
			ae.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
