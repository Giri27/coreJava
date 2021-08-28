package com.fruits.fruitsapp.comparator;

import java.util.Comparator;

import com.fruits.fruitsapp.dto.FruitsDTO;

public class SortFruitByName implements Comparator<FruitsDTO>{

	@Override
	public int compare(FruitsDTO o1, FruitsDTO o2) {
		
		return (o1.getFruitName().compareTo(o2.getFruitName()));
	}

}
