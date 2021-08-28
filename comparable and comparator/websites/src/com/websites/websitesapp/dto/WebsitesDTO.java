package com.websites.websitesapp.dto;

public class WebsitesDTO implements Comparable<WebsitesDTO>{
	
	private int websiteId;
	private String name;
	private String duration;
	
	public WebsitesDTO(int websiteId, String name, String duration) {
		super();
		this.websiteId = websiteId;
		this.name = name;
		this.duration = duration;
	}

	public WebsitesDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

	@Override
	public int compareTo(WebsitesDTO o) {
		
		return this.getWebsiteId() - o.getWebsiteId();
	}

	@Override
	public String toString() {
		return "WebsitesDTO [websiteId=" + websiteId + ", name=" + name + ", duration=" + duration + "]";
	}

	
	
}
