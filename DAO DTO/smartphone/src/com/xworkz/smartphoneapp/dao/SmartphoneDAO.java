package com.xworkz.smartphoneapp.dao;

import com.xworkz.smartphoneapp.dto.SmartphoneDTO;

public interface SmartphoneDAO {
	
	public boolean createSmartphone(SmartphoneDTO dto);
	public SmartphoneDTO[] getSmartphone(); 
	public boolean updatePriceById(float price, String id);
	public boolean deleteDetailsByBrandName(String brand);
}
