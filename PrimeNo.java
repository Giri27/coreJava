class PrimeNo{
	
	public static void findPrimeNo(int no, int temp){
		
		
		for(int i = 2; i < no; i++){
			if(no % i == 0)
				temp = temp+1;
		}
		if(temp > 0)
			System.out.println(no+" is not a prime number");
		else
			System.out.println(no+" is prime number");
		
	}
	
	public static void main(String a[]){
		
		int number;
		int temp;
		findPrimeNo(7, 0);
	}

}