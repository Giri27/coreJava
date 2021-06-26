class ShampooTester{
	
	public static void main(String a[]){
		
		Shampoo sham = new Shampoo("Dove",690,true);
		sham.getShampooDetails();
		
		Shampoo shampoo = new Shampoo("Sunsilk",650,true);
		shampoo.getShampooDetails();
		
		Shampoo sh = new Shampoo("Tressemme",648,false);
		sh.getShampooDetails();
		
		Shampoo shamp = new Shampoo("LorealParis",796,false);
		shamp.getShampooDetails();
		
		Shampoo shampo = new Shampoo("Clinic+",640,true);
		shampo.getShampooDetails();
		
		Shampoo smp = new Shampoo("Pantene",600,true);
		smp.getShampooDetails();
		
		Shampoo.washingHair();
		
	}


}