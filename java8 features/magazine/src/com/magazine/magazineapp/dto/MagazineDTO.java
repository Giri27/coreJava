package com.magazine.magazineapp.dto;

public class MagazineDTO implements Comparable<MagazineDTO>{
	
	private int magazineId;
	private String magazineName;
	private String magazineType;
	private double price;
	
	public MagazineDTO(int magazineId, String magazineName, String magazineType, double price) {
		super();
		this.magazineId = magazineId;
		this.magazineName = magazineName;
		this.magazineType = magazineType;
		this.price = price;
	}

	public int getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(int magazineId) {
		this.magazineId = magazineId;
	}

	public String getMagazineName() {
		return magazineName;
	}

	public void setMagazineName(String magazineName) {
		this.magazineName = magazineName;
	}

	public String getMagazineType() {
		return magazineType;
	}

	public void setMagazineType(String magazineType) {
		this.magazineType = magazineType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MagazineDTO [magazineId=" + magazineId + ", magazineName=" + magazineName + ", magazineType="
				+ magazineType + ", price=" + price + "]";
	}

	@Override
	public int compareTo(MagazineDTO o) {
		
		return (this.getMagazineId() - o.getMagazineId());
	}
	
	

}
