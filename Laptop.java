class Laptop{
	
	String company;
	String model;
	String processor;
	float price;
	
	public Laptop(String cmpny, String mdl, String prcssr, float prc){
		
		company = cmpny;
		model = mdl;
		processor = prcssr;
		price = prc;
		
	}
	
	public void getLaptopDetails(){
		
		System.out.println(company+", "+model+", "+processor+", "+price);
		
	}
	
	public static void displayVideo(){
		
		System.out.println();
		
	}
	
	public static void playGames(){
		
		System.out.println();
	}
	
	

}