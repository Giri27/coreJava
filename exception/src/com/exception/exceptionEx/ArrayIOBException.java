package com.exception.exceptionEx;

public class ArrayIOBException {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		try {
			int arr[] = new int[5];
			arr[0] = 2;
			arr[1] = 4;
			arr[2] = 6;
			arr[3] = 8;
			arr[4] = 10;
			arr[5] = 12;
			
		}catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("size of array is 5, cannot add 6 elements");
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
