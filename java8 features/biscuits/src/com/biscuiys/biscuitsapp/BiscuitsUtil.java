package com.biscuiys.biscuitsapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.biscuiys.biscuitsapp.comparator.SortBiscuitsByBrand;
import com.biscuiys.biscuitsapp.dto.BiscuitsDTO;

public class BiscuitsUtil {
	
	public static void main(String[] args) {
		
		List<BiscuitsDTO> list = new ArrayList<BiscuitsDTO>();
		list.add(new BiscuitsDTO(5, "Oreo", 10));
		list.add(new BiscuitsDTO(3, "Bourbon", 15));
		list.add(new BiscuitsDTO(1, "DarkFantasy", 30));
		list.add(new BiscuitsDTO(2, "JimJam", 5));
		list.add(new BiscuitsDTO(4, "Parle-G", 4));
		
		System.out.println("Fetching list elements using method reference");
		list.forEach(System.out::println);
		
		System.out.println("\nFetching list elements using lambda expression");
		Consumer<List<BiscuitsDTO>> consumer = (c) -> System.out.println(list);
		consumer.accept(list);
		
		System.out.println("\nDefault sorting technique | post sorting");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("\nCustomized sorting technique | sort by price");
		Collections.sort(list, new SortBiscuitsByBrand());
		list.forEach(System.out::println);
		
		System.out.println("\nComparing id and price using lambda expression");
		BiConsumer<Integer, Integer> biConsumer = (biscuitId, pricePerPacket) -> System.out.println(biscuitId.compareTo(pricePerPacket));
		biConsumer.accept(5, 10);
		
	}

}
