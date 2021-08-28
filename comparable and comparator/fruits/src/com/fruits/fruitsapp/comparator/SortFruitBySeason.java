package com.fruits.fruitsapp.comparator;

import java.util.Comparator;

import com.fruits.fruitsapp.dto.FruitsDTO;

public class SortFruitBySeason implements Comparator<FruitsDTO>{

	@Override
	public int compare(FruitsDTO o1, FruitsDTO o2) {
		
		return (o1.getSeason().compareTo(o2.getSeason()));
	}

}
