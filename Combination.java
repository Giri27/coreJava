class Combination{
	
	public static void findCombination(int n, int r){
		
		int result = fact(n)/(fact(r) * fact(n-r));
		System.out.println("Number of Combinations :" +result);
		
	}
	
	public static int fact(int n){
		
		int x=1;
		for(int i = 2; i <= n; i++)
			x = x*i;
		return x;
		
	}
	
	public static void main(String a[]){
		
		int number;
		int rvalue;
		findCombination(5, 3);
		
	}

}