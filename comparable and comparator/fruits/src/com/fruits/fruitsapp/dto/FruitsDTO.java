package com.fruits.fruitsapp.dto;

public class FruitsDTO implements Comparable<FruitsDTO>{
	
	private int fruitsId;
	private String fruitName;
	private String price;
	private String season;
	
	public FruitsDTO(int fruitsId, String fruitName, String price, String season) {
		super();
		this.fruitsId = fruitsId;
		this.fruitName = fruitName;
		this.price = price;
		this.season = season;
	}

	public int getFruitsId() {
		return fruitsId;
	}

	public void setFruitsId(int fruitsId) {
		this.fruitsId = fruitsId;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "FruitsDTO [fruitsId=" + fruitsId + ", fruitName=" + fruitName + ", price=" + price + ", season="
				+ season + "]";
	}

	@Override
	public int compareTo(FruitsDTO o) {
		
		return this.getFruitsId() - o.getFruitsId();
	}
}
