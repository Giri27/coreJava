package com.biscuiys.biscuitsapp.comparator;

import java.util.Comparator;

import com.biscuiys.biscuitsapp.dto.BiscuitsDTO;

public class SortBiscuitsByBrand implements Comparator<BiscuitsDTO>{

	@Override
	public int compare(BiscuitsDTO o1, BiscuitsDTO o2) {
		
		return (int) (o1.getPricePerPacket() - o2.getPricePerPacket());
	}
	
	

}
