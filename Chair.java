class Chair{
	
	String brand;
	String chairType;
	float pricePerChair;
	
	public Chair(String brd, String type, float price){
		
		brand = brd;
		chairType = type;
		pricePerChair = price;
		
	}
	
	public void getChairDetails(){
		
		System.out.println(brand+", "+chairType+", "+pricePerChair);
		
	}
	
	public static void sitting(){
		
		System.out.println();
	
	}


}