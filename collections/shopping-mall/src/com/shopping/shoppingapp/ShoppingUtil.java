package com.shopping.shoppingapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

import com.shopping.shoppingapp.dao.ShopDAO;
import com.shopping.shoppingapp.dao.ShopDAOImpl;
import com.shopping.shoppingapp.dto.ShopsDTO;

public class ShoppingUtil {
	
	public static void main(String[] args) {
		
		/*Collection<Object> collection = new ArrayList<Object>();
		collection.add("Levis");
		collection.add("Trends");
		collection.add(100);
		collection.add(245.90);
		collection.add('g');
		collection.add(true);
		collection.add(2);
		collection.
		
		Collection<Object> collection1 = new HashSet<Object>();
		Collection<Object> collection3 = new LinkedList<Object>();
		Collection<Object> collection4 = new TreeSet<Object>();
		Collection<Object> collection5 = new LinkedHashSet<Object>();
		Collection<Object> collection6 = new Vector<Object>();
		Collection<Object> collection7 = new PriorityQueue<Object>();

		for (Object object : collection) {
			
			System.out.println(object);
		}
		
		for(int i = 0; i < collection.size(); i++) {
			
			System.out.println(collection);
		}
		
		Iterator<Object> iterator = collection.iterator();
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}*/
		
		/*ShopsDTO shopsDTO = new ShopsDTO();
		shopsDTO.setShopId(27);
		shopsDTO.setShopName("pantaloons");
		shopsDTO.setType("Clothing");
		shopsDTO.setFloor("1st floor");
		
		ShopDAO dao = new ShopDAOImpl();
		dao.saveShop(shopsDTO);
		Collection<ShopsDTO> dtos = dao.getAllShops();
		for(ShopsDTO shopsDTO2 : dtos) {
			System.out.println(shopsDTO2);
		}
		
		dao.updateFloorByName("3rd floor", "pantaloons");
		Collection<ShopsDTO> dtos1 = dao.getAllShops();
		for(ShopsDTO shopsDTO2 : dtos1) {
			System.out.println(shopsDTO2);
		}
		
		dao.deleteShopById(27);
		
		Collection<ShopsDTO> dtos2 = dao.getAllShops();
		if(!dtos2.isEmpty()) {
			for(ShopsDTO shopsDTO2 : dtos2) {
				System.out.println(shopsDTO2);
			}
		} else {
			System.out.println("No collection of shop found");
		}*/
		
		ShopsDTO shopsDTO = new ShopsDTO();
		shopsDTO.setShopId(12);
		shopsDTO.setShopName("Trends");
		shopsDTO.setFloor("1st floor");
		shopsDTO.setType("Clothing");
		
		ShopsDTO shopsDTO1 = new ShopsDTO();
		shopsDTO1.setShopId(19);
		shopsDTO1.setShopName("Lifestyle");
		shopsDTO1.setFloor("2nd floor");
		shopsDTO1.setType("Clothing");
		
		ShopsDTO shopsDTO2 = new ShopsDTO();
		shopsDTO2.setShopId(31);
		shopsDTO2.setShopName("Bata");
		shopsDTO2.setFloor("3rd floor");
		shopsDTO2.setType("Footwear");
		
		Collection<ShopsDTO> dtos = new ArrayList<ShopsDTO>();
		dtos.add(shopsDTO);
		dtos.add(shopsDTO1);
		System.out.println(dtos.contains(shopsDTO2));
		
		Iterator<ShopsDTO> iterator = dtos.iterator();
		System.out.println("retriving shop dto from 1st collection");
		while(iterator.hasNext()) {
			ShopsDTO dto = iterator.next();
			System.out.println(dto);
		}
		
		Collection<ShopsDTO> dtos1 = new ArrayList<ShopsDTO>();
		dtos1.addAll(dtos);
		dtos1.add(shopsDTO2);
		System.out.println(dtos1.contains(shopsDTO2));
		//ShopsDTO[] dtos2 
		dtos.removeAll(dtos1);
		
		Collection<ShopsDTO> target = new ArrayList<ShopsDTO>();
		target.addAll(dtos);
		target.addAll(dtos1);
		
		target.retainAll(dtos1);
		
		target.addAll(dtos1);
		
		System.out.println(dtos.size());
		System.out.println(dtos1.size());
		System.out.println(target.size());
		
		Iterator<ShopsDTO> iterator1 = dtos.iterator();
		System.out.println("retriving shop dto from 2nd collection");
		while(iterator1.hasNext()) {
			ShopsDTO dto = iterator1.next();
			System.out.println(dto);
		}
	}
}
