package com.medicine.medicineapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.medicine.medicineapp.dto.MedicineDTO;

public class MedicineUtil {
	
	public static void main(String[] args) {
		
		MedicineDTO dto = new MedicineDTO();
		dto.setMedicineId(1);
		dto.setMedicineName("Dolo");
		dto.setPrice(45.00);
		dto.setMfgDate("11/01/2020");
		dto.setExpDate("11/01/2024");
		
		MedicineDTO dto2 = new MedicineDTO();
		dto2.setMedicineId(2);
		dto2.setMedicineName("Calpol");
		dto2.setPrice(15.00);
		dto2.setMfgDate("01/01/2019");
		dto2.setExpDate("01/01/2023");
		
		MedicineDTO dto3 = new MedicineDTO();
		dto3.setMedicineId(3);
		dto3.setMedicineName("Sinarest");
		dto3.setPrice(45.00);
		dto3.setMfgDate("9/01/2019");
		dto3.setExpDate("9/01/2023");
		
		List<MedicineDTO> list = new ArrayList<MedicineDTO>();
		list.add(dto);
		list.add(0, dto3);
		list.add(dto2);
		
		Iterator<MedicineDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			MedicineDTO medicineDTO = iterator.next();
			System.out.println(medicineDTO);
		}
		
		ListIterator<MedicineDTO> iterator2 = list.listIterator();
		System.out.println("\nForward direction");
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("\nBackward direction");
		while (iterator2.hasPrevious()) {
			System.out.println(iterator2.previous());
		}
		
		List list1 = new ArrayList();
		list1.add(9);
		list1.add(82);
		list1.add(27);
		list1.add(450);
		list1.add(76);
		list1.add(22);
		
		System.out.println("\nBefore sorting");
		System.out.println(list1);
		System.out.println("\nAfter sorting");
		Collections.sort(list1);
		System.out.println(list1);
		
		System.out.println("\nDescending order");
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
	}

}
