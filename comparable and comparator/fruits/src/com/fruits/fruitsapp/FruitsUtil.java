package com.fruits.fruitsapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.fruits.fruitsapp.comparator.SortFruitByName;
import com.fruits.fruitsapp.comparator.SortFruitByName;
import com.fruits.fruitsapp.comparator.SortFruitBySeason;
import com.fruits.fruitsapp.dto.FruitsDTO;

public class FruitsUtil {
	
	public static void main(String[] args) {
		
		List<FruitsDTO> list = new ArrayList<FruitsDTO>();
		list.add(new FruitsDTO(4, "Apple", "240/kg", "All Season fruit"));
		list.add(new FruitsDTO(2, "Mango", "200/kg", "Summer"));
		list.add(new FruitsDTO(3, "Orange", "70/kg", "All"));
		list.add(new FruitsDTO(1, "Banana", "40/kg", "All"));
		
		System.out.println("Default sorting technique");
		System.out.println("Pre sorting");
		for (FruitsDTO fruitsDTO : list) {
			System.out.println(fruitsDTO);
		}
		Collections.sort(list);
		System.out.println("Post sorting");
		for (FruitsDTO fruitsDTO : list) {
			System.out.println(fruitsDTO);
		}
		
		System.out.println("\nCustomized sorting technique");
		System.out.println("Pre sorting for SortBySeason");
		for (FruitsDTO fruitsDTO : list) {
			System.out.println(fruitsDTO);
		}
		Collections.sort(list, new SortFruitBySeason());
		System.out.println("Post sorting SortBySeason");
		for (FruitsDTO fruitsDTO : list) {
			System.out.println(fruitsDTO);
		}
		
		System.out.println("\nCustomized sorting technique");
		System.out.println("Pre sorting for SortByName");
		for (FruitsDTO fruitsDTO : list) {
			System.out.println(fruitsDTO);
		}
		Collections.sort(list, new SortFruitByName());
		System.out.println("Post sorting SortByName");
		for (FruitsDTO fruitsDTO : list) {
			System.out.println(fruitsDTO);
		}
		
		//Fail fast
		Iterator<FruitsDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			FruitsDTO fruits = iterator.next();
			System.out.println(fruits);
			if(fruits.getFruitsId()==1) {
				list.remove(fruits);
			}
		}
		System.out.println(list);
		
		//Fail safe
		/*Iterator<FruitsDTO> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			FruitsDTO fruits = iterator2.next();
			System.out.println(fruits);
			if(list == new FruitsDTO(1, "Banana", "40/kg", "All")) {
				list.add(new FruitsDTO(6, "Grapes", "50/kg", "Summer"));
			}
		}
		System.out.println(list);*/
	}
}
