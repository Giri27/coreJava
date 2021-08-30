package com.magazine.magazineapp.comparator;

import java.util.Comparator;

import com.magazine.magazineapp.dto.MagazineDTO;

public class SortMagazineByPrice implements Comparator<MagazineDTO>{

	@Override
	public int compare(MagazineDTO o1, MagazineDTO o2) {
		
		return (int) (o1.getPrice() - o2.getPrice());
	}

}
