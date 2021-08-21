package com.shopping.shoppingapp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.shopping.shoppingapp.dto.ShopsDTO;

public class ShopDAOImpl implements ShopDAO{

	public Collection<ShopsDTO> dtos = new ArrayList<ShopsDTO>();
	
	public ShopDAOImpl() {
		
	}
	
	@Override
	public void saveShop(ShopsDTO shopsDTO) {
		if(shopsDTO != null) {
			dtos.add(shopsDTO);
			System.out.println();
		}
		
	}

	@Override
	public Collection<ShopsDTO> getAllShops() {
		if(dtos != null && !dtos.isEmpty()) {
			return dtos;
		}
		return null;
	}

	@Override
	public void updateFloorByName(String floor, String name) {
		if(floor != null && name != null) {
			for(ShopsDTO shopsDTO : dtos) {
				if(name.equals(shopsDTO.getShopName()))
				shopsDTO.setFloor(floor);
			}
		}
		
	}

	@Override
	public void deleteShopById(int shopId) {
		
		if(shopId > 0) {
			//for(ShopsDTO shopsDTO : dtos) {
			Iterator<ShopsDTO> iterator = dtos.iterator();
			while(iterator.hasNext()) {
				ShopsDTO shopsDTO = iterator.next();
				if(shopId == shopsDTO.getShopId()) {
					dtos.remove(shopsDTO);
					System.out.println("shop deleted");
				}
			}
		}
		
	}

}
