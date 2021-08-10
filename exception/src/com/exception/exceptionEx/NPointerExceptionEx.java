package com.exception.exceptionEx;

public class NPointerExceptionEx {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		try {
			String str1 = null;
			String str2 = "Null";
			System.out.println(str1.equals(str2));
			
		}catch(NullPointerException npe) {
			
			System.out.println("null string cannot be compared");
			npe.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
