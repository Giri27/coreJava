class Multiplication{
	
	public static void main(String a[]){
		
		System.out.println("main method started");
		multiplicationOfTwoNos(7687, 56);
		multiplicationOfTwoNos(678, 9);
		multiplicationOfThreeNos(4, 8, 2.5F);
		multiplicationOfThreeNos(34, 2, 8);
		System.out.println("main method ended");
		
	}
	
	public static void multiplicationOfTwoNos(float m, int n){
		
		System.out.println("multiplication method started");
		float resOfTwoNos = (m*n);
		System.out.println("Multiplication of two numbers =" +resOfTwoNos);
		System.out.println("multiplication method ended");
		
	}
	
	public static void multiplicationOfThreeNos(float x, float y ,float z){
		
		System.out.println("multiplication method started");
		float resOfThreeNos = (x*y*z);
		System.out.println("Multiplication of three numbers =" +resOfThreeNos);
		System.out.println("multiplication method ended");
	}

}