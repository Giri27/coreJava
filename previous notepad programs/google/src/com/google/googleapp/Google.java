package com.google.googleapp;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Google {
	
	public static void main(String[] args) {
		System.out.println("google");
		
		//y-year M-month d-date 
		//H-hours m-minutes s-seconds
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("D E dd-MM-yyyy HH:mm:ss");
		String fdate = format.format(date);
		System.out.println(date);
		System.out.println(fdate);

	}

}
