class HardDiskDTOUtil{
	
	public static void main(String a[]){
		
		HardDiskDTO dto = new HardDiskDTO();
		dto.setBrand("SeaGate");
		dto.setPrice(5899);
		dto.setStorage("1.5TB");
		System.out.println(dto.getBrand() +", "+ dto.getPrice() +", "+ dto.getStorage());
		
		HardDiskDTO dto1 = new HardDiskDTO();
		dto1.setBrand("WesternDigital");
		dto1.setPrice(8120);
		dto1.setStorage("1TB");
		System.out.println(dto1.getBrand() +", "+ dto1.getPrice() +", "+ dto1.getStorage());
		
		HardDiskDTO dto2 = new HardDiskDTO();
		dto2.setBrand("WDElements");
		dto2.setPrice(5734);
		dto2.setStorage("1.5TB");
		System.out.println(dto2.getBrand() +", "+ dto2.getPrice() +", "+ dto2.getStorage());
		
	}

}