package com.websites.websitesapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import com.websites.websitesapp.comparator.SortWebsiteByName;
import com.websites.websitesapp.dto.WebsitesDTO;

public class WebsitesUtil {
	
	public static void main(String[] args) {
		
		I i = () -> {
			System.out.println("letz dance");
		};
		i.doSomething();
		
		WebsitesDTO dto = new WebsitesDTO();
		dto.setWebsiteId(1);
		dto.setName("bloggers.com");
		dto.setDuration("2 years");
		
		WebsitesDTO dto2 = new WebsitesDTO();
		dto2.setWebsiteId(2);
		dto2.setName("girija.com");
		dto2.setDuration("2 years");
		
		WebsitesDTO dto3 = new WebsitesDTO();
		dto3.setWebsiteId(3);
		dto3.setName("pavithra.com");
		dto3.setDuration("2 years");
		
		WebsitesDTO dto4 = new WebsitesDTO();
		dto4.setWebsiteId(4);
		dto4.setName("supreetha.com");
		dto4.setDuration("2 years");
		
		WebsitesDTO dto5 = new WebsitesDTO();
		dto5.setWebsiteId(5);
		dto5.setName("rakshita.com");
		dto5.setDuration("2 years");
		
		List<WebsitesDTO> dtos = new ArrayList<WebsitesDTO>();
		dtos.add(new WebsitesDTO(1, "bloggers.com", "2 years"));
		dtos.add(new WebsitesDTO(2, "girija.com", "2 years"));
		dtos.add(new WebsitesDTO(3, "pavithra.com", "2 years"));
		dtos.add(new WebsitesDTO(4, "supreetha.com", "2 years"));
		dtos.add(new WebsitesDTO(5, "rakshita.com", "2 years"));
		
		System.out.println("Default sorting technique");
		System.out.println("pre sorting");
		for(WebsitesDTO websitesDTO : dtos) {
			System.out.println(websitesDTO);
		}
		Collections.sort(dtos);
		System.out.println("post sorting");
		for(WebsitesDTO websitesDTO : dtos) {
			System.out.println(websitesDTO);
		}
		
		System.out.println("Customized sorting tecgnique");
		System.out.println("pre sorting");
		for(WebsitesDTO websitesDTO : dtos) {
			System.out.println(websitesDTO);
		}
		Collections.sort(dtos, new SortWebsiteByName());
		System.out.println("post sorting");
		for(WebsitesDTO websitesDTO : dtos) {
			System.out.println(websitesDTO);
		}
		
		System.out.println(dtos.size());
		System.out.println(dtos.get(4));
		System.out.println(dtos.size());
		
		
		for (WebsitesDTO websitesDTO : dtos) {
			System.out.println(websitesDTO);
		}
		
		/*Enumeration<WebsitesDTO> enumeration = dtos.elements();
		while(enumeration.hasMoreElements()) {
			WebsitesDTO dto6 = enumeration.nextElement();
			System.out.println(dto6);
		}*/
		
	
	}
}
