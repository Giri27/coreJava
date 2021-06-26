class Bottle{
	
	String brand;
	String bottleMaterial;
	float priceForOneLitre;
	
	public Bottle(String brd, String material, float price){
		
		brand = brd;
		bottleMaterial = material;
		priceForOneLitre = price;
		
	}
	
	public void getBottleDetails(){
		
		System.out.println(brand+", "+bottleMaterial+", "+priceForOneLitre);
		
	}
	
	public static void drinking(){
		
		System.out.println();
		
	}

}