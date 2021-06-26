class Pen{
	
	String company;
	float pricePerPen;
	String colorsAvailable;
	
	public Pen(String comp, float price, String color){
		
		company = comp;
		pricePerPen = price;
		colorsAvailable = color;
				
	}
	
	public void getPenDetails(){
		
		System.out.println(company+", "+pricePerPen+", "+colorsAvailable);
		
	}

	public static void writing(){
		
		System.out.println();
		
	}

}