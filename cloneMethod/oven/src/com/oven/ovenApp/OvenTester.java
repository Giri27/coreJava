package com.oven.ovenApp;

public class OvenTester {
	
	public static void main(String[] args) {
		
		Oven oven = new Oven();
		
		String baked = oven.baking(true, "32", 30);
		System.out.println(baked);
		
		try {
			Oven oven2 = (Oven) oven.clone();
		
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	}

}
