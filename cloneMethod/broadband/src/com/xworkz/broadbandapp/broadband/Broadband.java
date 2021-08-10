package com.xworkz.broadbandapp.broadband;

public class Broadband implements Cloneable{
	
	private String name;
	private double price;
	private boolean is5g;
	
	public Broadband() {
		
		System.out.println(this.getClass().getSimpleName() +" object is created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isIs5g() {
		return is5g;
	}

	public void setIs5g(boolean is5g) {
		this.is5g = is5g;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
