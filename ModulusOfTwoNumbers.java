class ModulusOfTwoNumbers{
	
	public static void main(String a[]){
		
		System.out.println("main method started");
		modulus(90, 9);
		modulus(23, 4);
		System.out.println("main method ended");
		
	}
	
	public static void modulus(int p, int q){
		
		System.out.println("modulus method started");
		int result = p%q;
		System.out.println("Modulus of =" +result);
		System.out.println("modulus method ended");
		
	}

}