package com.xworkz.atm.atmapp.machine;

import com.xworkz.atm.atmapp.exception.AtmException;

public class Machine {
	
	public void withDraw(int amount) {
		
		if(amount > 20000 || amount < 100 || amount % 100 != 0) {
			
			throw new AtmException();
		
		} else {
			
			System.out.println("Collect the cash");
		}
	}

}
