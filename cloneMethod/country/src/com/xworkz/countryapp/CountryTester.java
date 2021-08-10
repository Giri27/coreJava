package com.xworkz.countryapp;

import java.util.Scanner;

import com.xworkz.countryapp.country.Country;

public class CountryTester{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the country name");
		String name = scanner.next();
		
		try {
			Country country = new Country();
			
			country.setName("India");
			country.setCapitalCity("Delhi");
			country.setPopulation(1000000000);
			
			System.out.println(country.getName() +", "+ country.getCapitalCity() +", "+ country.getPopulation());
			
			Country country2 = (Country) country.clone();
			country2.setPopulation(1000000000);
			
			System.out.println(country2.getName() +", "+ country2.getCapitalCity() +", "+ country2.getPopulation());
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		finally {
			
			if(scanner != null) {
				scanner.close();
			} else {
				
				System.out.println("Scanner cannot be closed");
			}
		}
		System.out.println("main method ended");
	}
	

}
