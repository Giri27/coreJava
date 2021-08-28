package com.websites.websitesapp;

public class AImpl implements I{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		AImpl aimpl = new AImpl();
		aimpl.doSomething();    //abstract method
		aimpl.some();           //concrete method using default
		                        //concrete method using static cannot be accessed
		
	}

}
