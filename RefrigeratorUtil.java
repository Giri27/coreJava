class RefrigeratorUtil{
	
	static{
		System.out.println("Executing RefrigeratorUtil");
	}
	
	public static void main(String a[]){
		
		Refrigerator regrigerator = new Refrigerator();
		{
			System.out.println("Main method started");
			regrigerator.coldStorage();
			System.out.println("Main method ended");
		}
	}
	
}