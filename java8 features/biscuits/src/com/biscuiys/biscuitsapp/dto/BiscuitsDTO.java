package com.biscuiys.biscuitsapp.dto;

public class BiscuitsDTO implements Comparable<BiscuitsDTO>{
	
	private int biscuitId;
	private String brand;
	private double pricePerPacket;
	
	public BiscuitsDTO(int biscuitId, String brand, double price) {
		super();
		this.biscuitId = biscuitId;
		this.brand = brand;
		this.pricePerPacket = price;
	}

	public int getBiscuitId() {
		return biscuitId;
	}

	public void setBiscuitId(int biscuitId) {
		this.biscuitId = biscuitId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
			
	@Override
	public String toString() {
		return "BiscuitsDTO [biscuitId=" + biscuitId + ", brand=" + brand + ", price=" + pricePerPacket + "]";
	}

	public double getPricePerPacket() {
		return pricePerPacket;
	}

	public void setPricePerPacket(double pricePerPacket) {
		this.pricePerPacket = pricePerPacket;
	}

	@Override
	public int compareTo(BiscuitsDTO o) {
		
		return this.getBiscuitId() - o.getBiscuitId();
	}
	
}
