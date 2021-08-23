package com.city.cityapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.city.cityapp.dto.CityDTO;

public class CityUtil {
	
	public static void main(String[] args) {
		
		CityDTO dto = new CityDTO();
		dto.setCityId(1);
		dto.setCityName("Bangalore");
		dto.setNoOfTaluks(4);
		
		CityDTO dto2 = new CityDTO();
		dto2.setCityId(2);
		dto2.setCityName("Mumbai");
		dto2.setNoOfTaluks(3);
		
		CityDTO dto3 = new CityDTO();
		dto3.setCityId(2);
		dto3.setCityName("Mumbai");
		dto3.setNoOfTaluks(3);
		
		CityDTO dto4 = new CityDTO();
		dto4.setCityId(3);
		dto4.setCityName("Hyderabad");
		dto4.setNoOfTaluks(4);
		
		List<CityDTO> list = new ArrayList<CityDTO>();
		list.add(dto);
		list.add(dto2);
		list.add(dto4);
		list.add(dto3);
		
		Set<CityDTO> set = new HashSet<CityDTO>();
		set.add(dto4);
		set.add(dto3);
		set.add(dto2);
		set.add(dto);
		
		System.out.println("List");
		Iterator<CityDTO> iterator = list.iterator();
		while(iterator.hasNext()) {
			CityDTO city = iterator.next();
			System.out.println(city);
		}
		
		System.out.println("\nSet");
		Iterator<CityDTO> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			CityDTO city2 = iterator2.next();
			System.out.println(city2);
		}
	}

}
