package com.magazine.magazineapp.comparator;

import java.util.Comparator;

import com.magazine.magazineapp.dto.MagazineDTO;

public class SortByType implements Comparator<MagazineDTO>{

	@Override
	public int compare(MagazineDTO o1, MagazineDTO o2) {
		
		return (o1.getMagazineType().compareTo(o2.getMagazineType()));
	}

}
