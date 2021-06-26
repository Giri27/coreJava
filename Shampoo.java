class Shampoo{
	
	String brand;
	float priceForOneLtr;
	boolean isSachetAvailable;
	
	public Shampoo(String bnd, float price, boolean sachet){
		
		brand = bnd;
		priceForOneLtr = price;
		isSachetAvailable = sachet;
		
	}
	
	public void getShampooDetails(){
		
		System.out.println(brand+", "+priceForOneLtr+", "+isSachetAvailable);
		
	}
	
	public static void washingHair(){
		
		System.out.println();
		
	}

}