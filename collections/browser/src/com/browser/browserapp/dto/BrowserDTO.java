package com.browser.browserapp.dto;

import java.io.Serializable;

public class BrowserDTO implements Serializable{
	
	private int browserId;
	private String browserName;
	private int releasedYear;
	private String developer;
	
	public BrowserDTO() {
		super();
	}

	public int getBrowserId() {
		return browserId;
	}

	public void setBrowserId(int browserId) {
		this.browserId = browserId;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	@Override
	public String toString() {
		return "BrowserDTO [browserId=" + browserId + ", browserName=" + browserName + ", releasedYear=" + releasedYear
				+ ", developer=" + developer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + browserId;
		result = prime * result + ((browserName == null) ? 0 : browserName.hashCode());
		result = prime * result + ((developer == null) ? 0 : developer.hashCode());
		result = prime * result + releasedYear;
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
		BrowserDTO other = (BrowserDTO) obj;
		if (browserId != other.browserId)
			return false;
		if (browserName == null) {
			if (other.browserName != null)
				return false;
		} else if (!browserName.equals(other.browserName))
			return false;
		if (developer == null) {
			if (other.developer != null)
				return false;
		} else if (!developer.equals(other.developer))
			return false;
		if (releasedYear != other.releasedYear)
			return false;
		return true;
	}
}
