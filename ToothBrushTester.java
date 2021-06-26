class ToothBrushTester{
	
	public static void main(String a[]){
		
		ToothBrush tb = new ToothBrush("Colgate", 25, "WhiteWithGreen");
		tb.getToothBrushDetails();
		
		ToothBrush toothb = new ToothBrush("Oral-B", 15, "Blue");
		toothb.getToothBrushDetails();
		
		ToothBrush tbrush = new ToothBrush("Pepsodent", 10, "Red");
		tbrush.getToothBrushDetails();
		
		ToothBrush.brushingTeeth();
		
		
	
	}

}