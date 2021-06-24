class Addition{
	
	public static void main(String a[]){
		
		System.out.println("main method started");
		additionOfTwoNumbers(987, 789);
		additionOfTwoNumbers(68, 45);
		additionOfThreeNumbers(45, 78, 23);
		System.out.println("main method ended");
		
	}
	
	public static void additionOfTwoNumbers(int x, int y){
		int result = (x+y);
		System.out.println("addition method started");
		System.out.println("Addition of two numbers =" +result);
		System.out.println("addition method ended");
	
	}
	
	public static void additionOfThreeNumbers(int x, int y, int z){
		int result = (x+y+z);
		System.out.println("addition method started");
		System.out.println("Addition of three numbers =" +result);
		System.out.println("addition method ended");
	
	}

}