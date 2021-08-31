package com.powerbank.powerbankapp.dto;

public class PowerbankDTO implements Comparable<PowerbankDTO>{
	
	private int powerbankId;
	private String brand;
	private String batteryCapacity;
	private double price;
	
	public PowerbankDTO(int powerbankId, String brand, String batteryCapacity, double price) {
		super();
		this.powerbankId = powerbankId;
		this.brand = brand;
		this.batteryCapacity = batteryCapacity;
		this.price = price;
	}

	public int getPowerbankId() {
		return powerbankId;
	}

	public void setPowerbankId(int powerbankId) {
		this.powerbankId = powerbankId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PowerbankDTO [powerbankId=" + powerbankId + ", brand=" + brand + ", batteryCapacity=" + batteryCapacity
				+ ", price=" + price + "]";
	}

	@Override
	public int compareTo(PowerbankDTO o) {
		
		return this.getPowerbankId() - o.getPowerbankId();
	}
	
	

}
