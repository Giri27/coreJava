package com.browser.browserapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.browser.browserapp.dto.BrowserDTO;

public class BrowserUtil {
	
	public static void main(String[] args) {
		
		BrowserDTO dto = new BrowserDTO();
		dto.setBrowserId(1);
		dto.setBrowserName("Chrome");
		dto.setReleasedYear(2008);
		dto.setDeveloper("Google");
		
		BrowserDTO dto2 = new BrowserDTO();
		dto2.setBrowserId(2);
		dto2.setBrowserName("Mozilla Firefox");
		dto2.setReleasedYear(2002);
		dto2.setDeveloper("Mozilla, Blake ross, Ben Goodger");
		
		BrowserDTO dto3 = new BrowserDTO();
		dto3.setBrowserId(1);
		dto3.setBrowserName("chrome");
		dto3.setReleasedYear(2008);
		dto3.setDeveloper("Google");
		
		BrowserDTO dto4 = new BrowserDTO();
		dto4.setBrowserId(1);
		dto4.setBrowserName("Chrome");
		dto4.setReleasedYear(2008);
		dto4.setDeveloper("Google");
		
		List<BrowserDTO> list = new ArrayList<BrowserDTO>();
		list.add(dto4);
		list.add(dto3);
		list.add(dto2);
		list.add(dto);
		
		Set<BrowserDTO> set = new HashSet<BrowserDTO>();
		set.add(dto4);
		set.add(dto3);
		set.add(dto2);
		set.add(dto);
		
		System.out.println("List");
		Iterator<BrowserDTO> iterator = list.iterator();
		while(iterator.hasNext()) {
			BrowserDTO browser = iterator.next();
			System.out.println(browser);
		}
		
		System.out.println("\nSet");
		Iterator<BrowserDTO> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			BrowserDTO browser2 = iterator2.next();
			System.out.println(browser2);
		}
		
		Collection<BrowserDTO> collection = new ArrayList<BrowserDTO>();
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto);
		
		System.out.println("\nCollection");
		for (Iterator iterator3 = collection.iterator(); iterator3.hasNext();) {
			BrowserDTO browserDTO = (BrowserDTO) iterator3.next();
			System.out.println(browserDTO);
		}
		
		System.out.println(collection.addAll(collection));
		System.out.println(collection.addAll(set));
		System.out.println(collection.contains(iterator2));
		System.out.println(collection.contains(list));
		System.out.println(collection.contains(dto4));
		System.out.println(collection.equals(collection));
		System.out.println(collection.equals(set));
		System.out.println(collection.size());
		//System.out.println(collection.toArray());
		System.out.println(collection.remove(dto3));
		//System.out.println(collection.removeAll(collection));
		System.out.println(collection.size());
		System.out.println(collection.retainAll(collection));
		System.out.println(collection.size());
	}

}
