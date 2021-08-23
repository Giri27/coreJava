package com.library.libraryapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.library.libraryapp.dto.LibraryDTO;

public class LibraryUtil {
	
	public static void main(String[] args) {
		
		LibraryDTO dto1 = new LibraryDTO();
		dto1.setLibraryId(1);
		dto1.setLibraryName("Central Library");
		dto1.setLocation("Mg road");
		dto1.setType("Govt");
		
		LibraryDTO dto = new LibraryDTO();
		dto.setLibraryId(2);
		dto.setLibraryName("State Library");
		dto.setLocation("Rajaji nagar");
		dto.setType("Private");
		
		LibraryDTO dto2 = new LibraryDTO();
		dto2.setLibraryId(2);
		dto2.setLibraryName("State Library");
		dto2.setLocation("Rajaji nagar");
		dto2.setType("Private");
		
		List<LibraryDTO> list = new ArrayList<LibraryDTO>();
		list.add(dto1);
		list.add(dto);
		list.add(dto2);
		
		Set<LibraryDTO> set = new HashSet<LibraryDTO>();
		set.add(dto1);
		set.add(dto2);
		set.add(dto);
		
		System.out.println("List");
		Iterator<LibraryDTO> iterator = list.iterator();
		while(iterator.hasNext()){
			
			LibraryDTO library = iterator.next();
			System.out.println(library);
		}
		
		System.out.println("\nSet");
		Iterator<LibraryDTO> iterator1 = set.iterator();
		while(iterator1.hasNext()){
			
			LibraryDTO library1 = iterator1.next();
			System.out.println(library1);
		}
		
		
	}

}
