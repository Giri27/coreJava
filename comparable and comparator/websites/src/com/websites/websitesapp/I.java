package com.websites.websitesapp;

@FunctionalInterface       //it will not allow to add more than one abstarct method
public interface I {  //functional interface
	
	public void doSomething(); 
	
	public static void something() {  //static -one way to write concrete method
		
	}
	
	public default void some() {   //default -another way to write concrete method
		
	}

}
