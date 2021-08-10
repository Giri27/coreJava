package com.xworkz.countryapp.country;

public class Country implements Cloneable{
	
	private String name;
	private String capitalCity;
	private int population;
	
	
	public Country() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
