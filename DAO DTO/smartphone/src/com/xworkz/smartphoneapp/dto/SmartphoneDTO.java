package com.xworkz.smartphoneapp.dto;

import java.io.Serializable;

public class SmartphoneDTO implements Serializable{
	
	private String brand;
	private String id;
	private float price;
	private int noOfCameras;
	private String os;
	
	public SmartphoneDTO() {
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNoOfCameras() {
		return noOfCameras;
	}

	public void setNoOfCameras(int noOfCameras) {
		this.noOfCameras = noOfCameras;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartphoneDTO [brand=" + brand + ", id=" + id + ", price=" + price + ", noOfCameras="
				+ noOfCameras + ", os=" + os + "]";
	}
}
