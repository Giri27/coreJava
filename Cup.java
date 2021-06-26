class Cup{
	
	String company;
	String cupMaterial;
	float priceForSixCups;
	
	public Cup(String cmpny, String material, float price){
		
		company = cmpny;
		cupMaterial = material;
		priceForSixCups = price;
	}
	
	public void getCupDetails(){
		
		System.out.println(company+", "+cupMaterial+", "+priceForSixCups);
		
	}
	
	public static void drinkingTeaOrCoffee(){
		
		System.out.println();
		
	}

}