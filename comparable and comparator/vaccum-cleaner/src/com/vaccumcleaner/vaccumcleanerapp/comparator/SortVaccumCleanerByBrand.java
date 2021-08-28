package com.vaccumcleaner.vaccumcleanerapp.comparator;

import java.util.Comparator;

import com.vaccumcleaner.vaccumcleanerapp.dto.VaccumCleanerDTO;

public class SortVaccumCleanerByBrand implements Comparator<VaccumCleanerDTO>{

	@Override
	public int compare(VaccumCleanerDTO o1, VaccumCleanerDTO o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
