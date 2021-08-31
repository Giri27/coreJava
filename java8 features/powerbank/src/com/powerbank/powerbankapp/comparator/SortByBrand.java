package com.powerbank.powerbankapp.comparator;

import java.util.Comparator;

import com.powerbank.powerbankapp.dto.PowerbankDTO;

public class SortByBrand implements Comparator<PowerbankDTO>{

	@Override
	public int compare(PowerbankDTO o1, PowerbankDTO o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
