class ToothBrush{
	
	String brand;
	float price;
	String color;
	
	public ToothBrush(String bnd, float prce, String clr){
		
		brand = bnd;
		price = prce;
		color = clr;
		
	}
	
	public void getToothBrushDetails(){
		
		System.out.println(brand+", "+price+", "+color);
		
	}
	
	public static void brushingTeeth(){
		
		System.out.println();
		
	}

}