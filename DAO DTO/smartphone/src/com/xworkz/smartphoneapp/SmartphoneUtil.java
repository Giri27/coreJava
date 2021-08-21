package com.xworkz.smartphoneapp;

import java.util.Scanner;

import com.xworkz.smartphoneapp.dao.SmartphoneDAO;
import com.xworkz.smartphoneapp.dao.SmartphoneDAOImpl;
import com.xworkz.smartphoneapp.dto.SmartphoneDTO;

public class SmartphoneUtil {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		SmartphoneDAO smartphoneDAO = new SmartphoneDAOImpl(size);
		
		for(int i = 0; i < size; i++) {
			
			SmartphoneDTO dto = new SmartphoneDTO();
			dto.setId(sc.next());
			dto.setBrand(sc.next());
			dto.setPrice(sc.nextFloat());
			dto.setNoOfCameras(sc.nextInt());
			dto.setOs(sc.next());
			
			smartphoneDAO.createSmartphone(dto);
		}
		
		SmartphoneDTO[] smartphoneDTOs = smartphoneDAO.getSmartphone();
		for (SmartphoneDTO smartphoneDTO : smartphoneDTOs) {
			
			System.out.println(smartphoneDTO);
		}
		
		System.out.println("Enter the price and id to update the smartphone price");
		smartphoneDAO.updatePriceById(sc.nextFloat(), sc.next());
		SmartphoneDTO[] smartphoneDTOs2 = smartphoneDAO.getSmartphone();
		for (SmartphoneDTO smartphoneDTO : smartphoneDTOs2) {
			
			System.out.println(smartphoneDTO);
		}
		
		System.out.println("Enter the brand to delete the smartphone details");
		smartphoneDAO.deleteDetailsByBrandName(sc.next());
		SmartphoneDTO[] smartphoneDTOs3 = smartphoneDAO.getSmartphone();
		for (SmartphoneDTO smartphoneDTO : smartphoneDTOs3) {
			
			System.out.println(smartphoneDTO);
		}
	}

}
