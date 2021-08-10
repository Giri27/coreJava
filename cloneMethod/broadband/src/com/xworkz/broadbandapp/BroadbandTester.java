package com.xworkz.broadbandapp;

import com.xworkz.broadbandapp.broadband.Broadband;

public class BroadbandTester {
	
	public static void main(String[] args) {
		
		Broadband bb = new Broadband();
		bb.setName("Hathway");
		bb.setPrice(1700.00);
		bb.setIs5g(true);
		System.out.println(bb.getName() +", "+ bb.getPrice() +", "+ bb.isIs5g());
				
		try {
			Broadband bb1 = (Broadband) bb.clone();
			System.out.println(bb1.getName() +", "+ bb1.getPrice() +", "+ bb1.isIs5g());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
