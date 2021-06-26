class CoughSyrup{
	
	String company;
	float pricePerBottle;
	boolean isSugarFree;
	
	public CoughSyrup(String compny, float price, boolean sugarFree){
		
		company = compny;
		pricePerBottle = price;
		isSugarFree = sugarFree;
	}
	
	public void getSyrupDetails(){
		
		System.out.println(company+", "+pricePerBottle+", "+isSugarFree);
	}
	
	public static void reliefFromCough(){
		
		System.out.println();
		
	}

}