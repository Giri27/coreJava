package com.vaccumcleaner.vaccumcleanerapp.dto;

public class VaccumCleanerDTO implements Comparable<VaccumCleanerDTO>{
	
	private int VaccumCleanerId;
	private String brand;
	private String voltage;
	private String price;
	
	public VaccumCleanerDTO(int vaccumCleanerId, String brand, String voltage, String price) {
		super();
		VaccumCleanerId = vaccumCleanerId;
		this.brand = brand;
		this.voltage = voltage;
		this.price = price;
	}
	
	public int getVaccumCleanerId() {
		return VaccumCleanerId;
	}

	public void setVaccumCleanerId(int vaccumCleanerId) {
		VaccumCleanerId = vaccumCleanerId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "VaccumCleanerDTO [VaccumCleanerId=" + VaccumCleanerId + ", brand=" + brand + ", voltage=" + voltage
				+ ", price=" + price + "]";
	}

	@Override
	public int compareTo(VaccumCleanerDTO o) {
		// TODO Auto-generated method stub
		return this.getVaccumCleanerId() - o.getVaccumCleanerId();
	}
}
