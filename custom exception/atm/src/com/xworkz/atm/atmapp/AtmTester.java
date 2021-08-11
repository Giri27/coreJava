package com.xworkz.atm.atmapp;

import java.util.Scanner;

import com.xworkz.atm.atmapp.exception.AtmException;
import com.xworkz.atm.atmapp.machine.Machine;

public class AtmTester {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		Machine machine = new Machine();
		
		try{
			machine.withDraw(sc.nextInt());
			//System.exit(0);
			
		} catch (AtmException e) {
			
			System.out.println(e.getMessage());
			
		} finally {
			
			if(sc != null)
				sc.close();
			
		}

	}
}
