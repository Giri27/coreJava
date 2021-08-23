package com.electronics.electronicsapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.electronics.electronicsapp.dto.ElectronicsDTO;

public class ElectronicsUtil {
	
	public static void main(String[] args) {
		
		ElectronicsDTO dto = new ElectronicsDTO();
		dto.setId(1);
		dto.setName("Croma");
		dto.setLocation("Jp nagar");
		
		ElectronicsDTO dto2 = new ElectronicsDTO();
		dto2.setId(2);
		dto2.setName("Hitech");
		dto2.setLocation("Jay nagar");
		
		ElectronicsDTO dto3 = new ElectronicsDTO();
		dto3.setId(1);
		dto3.setName("Croma");
		dto3.setLocation("Jp nagar");
		
		ElectronicsDTO dto4 = new ElectronicsDTO();
		dto4.setId(2);
		dto4.setName("Hitech");
		dto4.setLocation("Jay nagar");
		
		List<ElectronicsDTO> list = new ArrayList<ElectronicsDTO>();
		list.add(dto4);
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		list.add(dto4);
		
		Set<ElectronicsDTO> set = new HashSet<ElectronicsDTO>();
		set.add(dto4);
		set.add(dto3);
		set.add(dto2);
		set.add(dto);
		
		System.out.println("List");
		Iterator<ElectronicsDTO> iterator = list.iterator();
		while(iterator.hasNext()) {
			ElectronicsDTO electronics = iterator.next();
			System.out.println(electronics);
		}
		
		System.out.println("Set");
		Iterator<ElectronicsDTO> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			ElectronicsDTO electronics2 = iterator2.next();
			System.out.println(electronics2);
		}
	}
}
