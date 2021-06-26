class LaptopTester{
	
	public static void main(String a[]){
		
		Laptop lp = new Laptop("HP", "hp-14s", "i5", 53000);
		lp.getLaptopDetails();
		
		Laptop lap = new Laptop("Dell", "Inspiron 3505", "i3", 32000);
		lap.getLaptopDetails();
		
		Laptop lptop = new Laptop("Lenovo", "V15", "AMD", 34990);
		lptop.getLaptopDetails();
		
		Laptop.displayVideo();
		Laptop.playGames();
		
		
	}

}