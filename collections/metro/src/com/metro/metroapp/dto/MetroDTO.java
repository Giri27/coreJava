package com.metro.metroapp.dto;

import java.io.Serializable;

public class MetroDTO implements Serializable{
	
	private int metroId;
	private String location;
	private int noOfMetroLines;
	private int noOfMetroStations;
	
	public MetroDTO() {
		super();
	}

	public int getMetroId() {
		return metroId;
	}

	public void setMetroId(int metroId) {
		this.metroId = metroId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfMetroLines() {
		return noOfMetroLines;
	}

	public void setNoOfMetroLines(int noOfMetroLines) {
		this.noOfMetroLines = noOfMetroLines;
	}

	public int getNoOfMetroStations() {
		return noOfMetroStations;
	}

	public void setNoOfMetroStations(int noOfMetroStations) {
		this.noOfMetroStations = noOfMetroStations;
	}

	@Override
	public String toString() {
		return "MetroDTO [metroId=" + metroId + ", location=" + location + ", noOfMetroLines=" + noOfMetroLines
				+ ", noOfMetroStations=" + noOfMetroStations + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + metroId;
		result = prime * result + noOfMetroLines;
		result = prime * result + noOfMetroStations;
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
		MetroDTO other = (MetroDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (metroId != other.metroId)
			return false;
		if (noOfMetroLines != other.noOfMetroLines)
			return false;
		if (noOfMetroStations != other.noOfMetroStations)
			return false;
		return true;
	}
}
