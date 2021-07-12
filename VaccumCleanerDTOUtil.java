class VaccumCleanerDTOUtil{
	
	public static void main(String a[]){
		
		VaccumCleanerDTO dto = new VaccumCleanerDTO();
		dto.setBrand("Eureka Forbes");
		dto.setPrice(4499);
		dto.setVoltage("230volts");
		System.out.println(dto.getBrand() +", "+ dto.getPrice() +", "+ dto.getVoltage());
		
		VaccumCleanerDTO dto1 = new VaccumCleanerDTO();
		dto1.setBrand("Philips");
		dto1.setPrice(9995);
		dto1.setVoltage("370volts");
		System.out.println(dto1.getBrand() +", "+ dto1.getPrice() +", "+ dto1.getVoltage());
		
		VaccumCleanerDTO dto2 = new VaccumCleanerDTO();
		dto2.setBrand("Inalsa");
		dto2.setPrice(4595);
		dto2.setVoltage("240volts");
		System.out.println(dto2.getBrand() +", "+ dto2.getPrice() +", "+ dto2.getVoltage());
	}
}