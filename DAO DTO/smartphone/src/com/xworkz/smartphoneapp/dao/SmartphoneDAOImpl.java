package com.xworkz.smartphoneapp.dao;

import com.xworkz.smartphoneapp.dto.SmartphoneDTO;

public class SmartphoneDAOImpl implements SmartphoneDAO{
	
	public SmartphoneDTO[] smartphones;
	private int index;
	
	public SmartphoneDAOImpl(int size) {
		
		smartphones = new SmartphoneDTO[size];
	}

	@Override
	public boolean createSmartphone(SmartphoneDTO dto) {
		boolean smartphoneAdded = false;
		try{
			if(dto != null && !dto.getId().isEmpty()) {
				
				smartphones[index++] = dto;
				smartphoneAdded = true;
			} else if (dto.getId().isEmpty()){
				
				System.out.println("cannot add smartphone as the fields are empty");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return smartphoneAdded;
	}

	@Override
	public SmartphoneDTO[] getSmartphone() {
		return smartphones;
	}

	@Override
	public boolean updatePriceById(float price, String id) {
		boolean detailsUpdated = false;
		if(price > 0 && id != null) {
			for(SmartphoneDTO smartphoneDTO : smartphones) {
				if(smartphoneDTO.getId().equals(id)) {
					smartphoneDTO.setPrice(price);
					detailsUpdated = true;
				} else {
					System.out.println("id not found");
				}
			}
		}
		return detailsUpdated;
	}
	
	@Override
	public boolean deleteDetailsByBrandName(String brand) {
		boolean smartphoneDetailsDeleted = false;
		if(brand != null) {
			for(SmartphoneDTO smartphoneDTO : smartphones) {
				if(smartphoneDTO.getBrand().equals(brand)) {
					smartphoneDTO = null;
					smartphoneDetailsDeleted = true;
				} else {
					System.out.println("brand not found");
				}
			}
		}
		return false;
	}

}
