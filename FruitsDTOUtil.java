class FruitsDTOUtil{
	
	public static void main(String a[]){
		
		FruitsDTO dto = new FruitsDTO();
		dto.setName("Apple");
		dto.setPrice(150);
		dto.setSeason("All season fruit");
		dto.setQuantityInKg(1);
		System.out.println(dto.getName() +", "+ dto.getPrice() +", "+ dto.getSeason() +", "+ dto.getQuantityInKg());
		
		FruitsDTO dto1 = new FruitsDTO();
		dto1.setName("Mango");
		dto1.setPrice(200);
		dto1.setSeason("Summer");
		dto1.setQuantityInKg(1);
		System.out.println(dto1.getName() +", "+ dto1.getPrice() +", "+ dto1.getSeason() +", "+ dto1.getQuantityInKg());
		
		FruitsDTO dto2 = new FruitsDTO();
		dto2.setName("Orange");
		dto2.setPrice(70);
		dto2.setSeason("All");
		dto2.setQuantityInKg(1);
		System.out.println(dto2.getName() +", "+ dto2.getPrice() +", "+ dto2.getSeason() +", "+ dto2.getQuantityInKg());
	}
}