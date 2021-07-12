class TableDTOUtil{
	
	public static void main(String a[]){
		
		TableDTO dto = new TableDTO();
		
		dto.setTableId(34);
		dto.setPrice(1450);
		dto.setTableType("Plastic");
		System.out.println(dto.getTableId() +", "+ dto.getPrice() +", "+ dto.getTableType());
		
		TableDTO dto1 = new TableDTO();
		
		dto1.setTableId(111);
		dto1.setPrice(2950);
		dto1.setTableType("Wooden");
		System.out.println(dto1.getTableId() +", "+ dto1.getPrice() +", "+ dto1.getTableType());
		
		TableDTO dto2 = new TableDTO();
		
		dto2.setTableId(41);
		dto2.setPrice(4010);
		dto2.setTableType("Metal");
		System.out.println(dto2.getTableId() +", "+ dto2.getPrice() +", "+ dto2.getTableType());
		
	}

}