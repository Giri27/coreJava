class PowerBankDTOUtil{
	
	public static void main(String a[]){
		
		PowerBankDTO dto = new PowerBankDTO();
		
		dto.setBrand("MI");
		dto.setPrice(2199);
		dto.setBatteryCapacity("20000mAh");
		System.out.println(dto.getBrand() +", "+ dto.getPrice() +", "+ dto.getBatteryCapacity());
		
		PowerBankDTO dto1 = new PowerBankDTO();
		
		dto1.setBrand("OnePlus");
		dto1.setPrice(1299);
		dto1.setBatteryCapacity("1000mAh");
		System.out.println(dto1.getBrand() +", "+ dto1.getPrice() +", "+ dto1.getBatteryCapacity());
		
		PowerBankDTO dto2 = new PowerBankDTO();
		
		dto2.setBrand("PTron");
		dto2.setPrice(2999);
		dto2.setBatteryCapacity("10000mAh");
		System.out.println(dto2.getBrand() +", "+ dto2.getPrice() +", "+ dto2.getBatteryCapacity());
		
	}

}