package com.oven.ovenApp;

public class Oven implements Cloneable{
	
	public boolean isWireConnected = true;
	
	public Oven() {
		
		System.out.println(this.getClass().getSimpleName() + " object is created");
	}
	
	public String baking(boolean isWireConnected, String temp, int duration) {
		String baked = null;
		try {
			if(isWireConnected) {
				
				if(temp != null && duration > 0) {
					
					baked = "item baked";
					return baked;
				}
			}
		
		}catch(Throwable e) {
			e.printStackTrace();
		}
			
		return null;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
