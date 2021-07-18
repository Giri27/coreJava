class Medicine{
	
	public static int id;
	public static String name;
	public static double price;
	public static String mfgDate;
	public static String expDate;
	
	public void curesDisease(){
		System.out.println("Treats diseases");
	}
	
	public Medicine(){
		
		System.out.println("Medicine object is created");
	}
	
	{
		System.out.println("Instant initialization block is started");
		id = 245;
		name = "Dolo";
		price = 45.00;
		mfgDate = "12/01/2019";
		expDate = "21/01/2022";
		System.out.println(id +", "+ name +", "+ price +", "+ mfgDate +", "+ expDate);
		System.out.println("Instant initialization block is ended");		
	}
	
	static{
		System.out.println("Static initialization block is started");
		id = 245;
		name = "Dolo";
		price = 45.00;
		mfgDate = "12/01/2019";
		expDate = "21/01/2022";
		System.out.println(id +", "+ name +", "+ price +", "+ mfgDate +", "+ expDate);
		System.out.println("Static initialization block is ended");		
	}
	
}