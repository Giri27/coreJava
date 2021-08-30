package com.magazine.magazineapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.magazine.magazineapp.comparator.SortByType;
import com.magazine.magazineapp.comparator.SortMagazineByPrice;
import com.magazine.magazineapp.dao.MagazineDAO;
import com.magazine.magazineapp.dao.MagazineDAOImpl;
import com.magazine.magazineapp.dto.MagazineDTO;

public class MagazineUtil {
	
	public static void main(String[] args) {
		
		List<MagazineDTO> list = new ArrayList<MagazineDTO>();
		list.add(new MagazineDTO(1, "Forbes", "Business", 200.00));
		list.add(new MagazineDTO(5, "Outlook", "Current affairs & News", 250.00));
		list.add(new MagazineDTO(4, "India Today", "News", 75));
		list.add(new MagazineDTO(3, "Competition success", "Current affairs", 320));
		list.add(new MagazineDTO(2, "Digit", "Technology", 50));
		
		System.out.println("Fetching list of elements using lambda expression");
		Consumer<List<MagazineDTO>> consumer = (l) -> System.out.println(list);
		consumer.accept(list);
		
		System.out.println("Fetching list of elements using method reference");	
		System.out.println("Default sorting technique pre sorting");
		list.forEach(System.out::println);
		System.out.println("Default sorting technique post sorting");
		Collections.sort(list);
		list.forEach(System.out::println);
		
		System.out.println("\nCustomized sorting technique");
		System.out.println("pre sorting");
		list.forEach(System.out::println);
		System.out.println("post sorting");
		Collections.sort(list, new SortMagazineByPrice());;
		list.forEach(System.out::println);
		
		System.out.println("\nCustomized sorting technique | sort by type");
		System.out.println("pre sorting");
		list.forEach(System.out::println);
		System.out.println("post sorting");
		Collections.sort(list, new SortByType());;
		list.forEach(System.out::println);
		
		Set<MagazineDTO> set = new HashSet<MagazineDTO>();
		set.add(new MagazineDTO(1, "Forbes", "Business", 200.00));
		set.add(new MagazineDTO(5, "Outlook", "Current affairs & News", 250.00));
		set.add(new MagazineDTO(4, "India Today", "News", 75));
		set.add(new MagazineDTO(3, "Competition success", "Current affairs", 320));
		set.add(new MagazineDTO(2, "Digit", "Technology", 50));
		
		System.out.println("\nFetching list of elements using lambda expression");
		Consumer<Set<MagazineDTO>> consumer2 = (s) -> System.out.println(set);
		consumer2.accept(set);
		
		//Functional interface
		System.out.println("\nUsing lambda expression");
		MagazineDAO dao2 = () -> System.out.println("provides information");
		dao2.information();
		
		System.out.println("\nUsing method reference");
		MagazineDAO dao = MagazineDAOImpl :: information;
		dao.information();
			
		//BiConsumer
		System.out.println("\nBiConsumer using lambda expression");
		BiConsumer<String, String> consumer3 = (magazineName, magazineType) -> System.out.println(magazineName+" "+magazineType);
		consumer3.accept("India Today", "News");
				
	}

}
