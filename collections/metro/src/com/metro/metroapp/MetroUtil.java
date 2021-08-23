package com.metro.metroapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.metro.metroapp.dto.MetroDTO;

public class MetroUtil {
	
	public static void main(String[] args) {
		
		MetroDTO dto = new MetroDTO();
		dto.setMetroId(11);
		dto.setLocation("Bangalore");
		dto.setNoOfMetroLines(2);
		dto.setNoOfMetroStations(46);
		
		MetroDTO dto2 = new MetroDTO();
		dto2.setMetroId(12);
		dto2.setLocation("Delhi");
		dto2.setNoOfMetroLines(10);
		dto2.setNoOfMetroStations(253);
		
		MetroDTO dto3 = new MetroDTO();
		dto3.setMetroId(11);
		dto3.setLocation("Bangalore");
		dto3.setNoOfMetroLines(2);
		dto3.setNoOfMetroStations(46);
		
		List<MetroDTO> list = new ArrayList<MetroDTO>();
		list.add(dto);
		list.add(dto3);
		list.add(dto2);
		
		Set<MetroDTO> set = new HashSet<MetroDTO>();
		set.add(dto2);
		set.add(dto);
		set.add(dto3);
		
		System.out.println("List");
		Iterator<MetroDTO> iterator = list.iterator();
		while(iterator.hasNext()) {
			MetroDTO metro = iterator.next();
			System.out.println(metro);
		}
		
		System.out.println("\nSet");
		Iterator<MetroDTO> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			MetroDTO metro2 = iterator2.next();
			System.out.println(metro2);
		}
	}

}
