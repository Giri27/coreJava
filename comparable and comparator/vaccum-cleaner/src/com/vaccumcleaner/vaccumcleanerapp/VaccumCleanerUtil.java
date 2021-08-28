package com.vaccumcleaner.vaccumcleanerapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.vaccumcleaner.vaccumcleanerapp.comparator.SortVaccumCleanerByBrand;
import com.vaccumcleaner.vaccumcleanerapp.comparator.SortVaccumCleanerByPrice;
import com.vaccumcleaner.vaccumcleanerapp.comparator.SortVaccumCleanerByVoltage;
import com.vaccumcleaner.vaccumcleanerapp.dto.VaccumCleanerDTO;

public class VaccumCleanerUtil {
	
	public static void main(String[] args) {
		
		List<VaccumCleanerDTO> list = new ArrayList<VaccumCleanerDTO>();
		list.add(new VaccumCleanerDTO(24, "Eureka Forbes", "230 volts", "4499"));
		list.add(new VaccumCleanerDTO(11, "Philips", "370 volts", "9995"));
		list.add(new VaccumCleanerDTO(39, "Inalsa", "240 volts", "4595"));
		
		System.out.println("Default sorting technique");
		System.out.println("Before sorting");
		Iterator<VaccumCleanerDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Collections.sort(list);
		System.out.println("After sorting");
		Iterator<VaccumCleanerDTO> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("\nCustomized sorting technique");
		System.out.println("Before sorting SortByBrand");
		Iterator<VaccumCleanerDTO> iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		Collections.sort(list, new SortVaccumCleanerByBrand());
		System.out.println("After sorting SortByBrand");
		Iterator<VaccumCleanerDTO> iterator4 = list.iterator();
		while (iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}
		
		System.out.println("\nCustomized sorting technique");
		System.out.println("Before sorting SortByPrice");
		Iterator<VaccumCleanerDTO> iterator5 = list.iterator();
		while (iterator5.hasNext()) {
			System.out.println(iterator5.next());
		}
		Collections.sort(list, new SortVaccumCleanerByPrice());
		System.out.println("After sorting SortByPrice");
		Iterator<VaccumCleanerDTO> iterator6 = list.iterator();
		while (iterator6.hasNext()) {
			System.out.println(iterator6.next());
		}
		
		System.out.println("\nCustomized sorting technique");
		System.out.println("Before sorting SortByVoltage");
		Iterator<VaccumCleanerDTO> iterator7 = list.iterator();
		while (iterator7.hasNext()) {
			System.out.println(iterator7.next());
		}
		Collections.sort(list, new SortVaccumCleanerByVoltage());
		System.out.println("After sorting SortByVoltage");
		Iterator<VaccumCleanerDTO> iterator8 = list.iterator();
		while (iterator8.hasNext()) {
			System.out.println(iterator8.next());
		}
		
		//Fail safe
		Iterator<VaccumCleanerDTO> iterator9 = list.iterator();
		while (iterator9.hasNext()) {
			VaccumCleanerDTO vc = iterator9.next();
			System.out.println(vc);
			if(vc.getVaccumCleanerId() == 11) {
				list.add(new VaccumCleanerDTO(21, "Dyson", "400 volts", "39000"));
			}
		}
	}

}
