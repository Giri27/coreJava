package com.powerbank.powerbankapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.powerbank.powerbankapp.comparator.SortByBrand;
import com.powerbank.powerbankapp.dao.PowerbankDAO;
import com.powerbank.powerbankapp.dao.PowerbankDAOImpl;
import com.powerbank.powerbankapp.dto.PowerbankDTO;

public class PowerbankUtil {
	
	public static void main(String[] args) {
		
		List<PowerbankDTO> list = new ArrayList<PowerbankDTO>();
		list.add(new PowerbankDTO(3, "MI", "20000mAH", 2199.00));
		list.add(new PowerbankDTO(1, "Oneplus", "10000mAH", 1299.00));
		list.add(new PowerbankDTO(2, "PTron", "20000mAH", 2999.00));
		
		System.out.println("Fetching list elements using lambda expression");
		Consumer<List<PowerbankDTO>> consumer = (s) -> System.out.println(list);
		consumer.accept(list);
		
		
		System.out.println("\nFetching list elements using method reference");
		list.forEach(System.out::println); //method reference
		
		Set<PowerbankDTO> set = new LinkedHashSet<PowerbankDTO>();
		set.add(new PowerbankDTO(3, "MI", "20000mAH", 2199.00));
		set.add(new PowerbankDTO(1, "Oneplus", "10000mAH", 1299.00));
		set.add(new PowerbankDTO(2, "PTron", "20000mAH", 2999.00));
		
		System.out.println("\nFetching set elements using method reference");
		set.forEach(System.out::println); //method reference
		
		System.out.println("\nFetching set elements using lambda expression");
		Consumer<Set<PowerbankDTO>> consumer2 = (c) -> System.out.println(set);
		consumer2.accept(set);
		
		System.out.println("Biconsumer using lambda expression");
		BiConsumer<String, Double> biConsumer = (brand, price) -> System.out.println(brand +" "+price);
		biConsumer.accept("Oneplus", 2199.00);
		
		PowerbankDAO dao = PowerbankDAOImpl :: providesPower;
		dao.providesPower();
		
		System.out.println("\nDefault sorting technique");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("\nCustomized sorting technique | Sort by brand");
		Collections.sort(list, new SortByBrand());
		list.forEach(System.out::println);
		
	}

}
