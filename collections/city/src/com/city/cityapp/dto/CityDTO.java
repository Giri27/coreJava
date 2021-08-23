package com.city.cityapp.dto;

import java.io.Serializable;

public class CityDTO implements Serializable{
	
	private int cityId;
	private String cityName;
	private int noOfTaluks;
	
	public CityDTO() {
		super();
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getNoOfTaluks() {
		return noOfTaluks;
	}

	public void setNoOfTaluks(int noOfTaluks) {
		this.noOfTaluks = noOfTaluks;
	}

	@Override
	public String toString() {
		return "CityDTO [cityId=" + cityId + ", cityName=" + cityName + ", noOfTaluks=" + noOfTaluks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cityId;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + noOfTaluks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityDTO other = (CityDTO) obj;
		if (cityId != other.cityId)
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (noOfTaluks != other.noOfTaluks)
			return false;
		return true;
	}
	
	
	
}
