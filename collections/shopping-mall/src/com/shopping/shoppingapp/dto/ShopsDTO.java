package com.shopping.shoppingapp.dto;

import java.io.Serializable;

public class ShopsDTO implements Serializable{
	
	private int shopId;
	private String shopName;
	private String type;
	private String floor;
	
	public ShopsDTO() {
		
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "ShopsDTO [shopId=" + shopId + ", shopName=" + shopName + ", type=" + type + ", floor=" + floor + "]";
	}
}
