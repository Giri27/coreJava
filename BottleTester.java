class BottleTester{
	
	public static void main(String a[]){
		
		Bottle bottle = new Bottle("Milton", "Steel", 1200);
		bottle.getBottleDetails();
		
		Bottle btl = new Bottle("Dr.copper", "Copper", 975);
		btl.getBottleDetails();
		
		Bottle botle = new Bottle("Papyrus", "Glass", 400);
		botle.getBottleDetails();
		
		Bottle btle = new Bottle("TupperWare", "Plastic", 350);
		btle.getBottleDetails();
		
		Bottle.drinking();
		
	}


}