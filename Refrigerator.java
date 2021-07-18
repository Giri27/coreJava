class Refrigerator{
	
	public static int id;
	public static String name;
	public static int noOfDoors;
	public static double price;
	
	public void coldStorage(){
		System.out.println("keeps the storage cold");
	}
	
	public Refrigerator(){
		System.out.println("Refrigerator object is created");
	}
	
	{
		System.out.println("Instant initialization block is started");
		id = 87;
		name = "Samsung";
		noOfDoors = 2;
		price = 45000.00;
		System.out.println(id +", "+ name +", "+ noOfDoors +", "+ price);
		System.out.println("Instant initialization block is ended");	
	}
	
	static{
		System.out.println("Static initialization block is started");
		id = 87;
		name = "Samsung";
		noOfDoors = 2;
		price = 45000.00;
		System.out.println(id +", "+ name +", "+ noOfDoors +", "+ price);
		System.out.println("Static initialization block is ended");
	}
	
	
}