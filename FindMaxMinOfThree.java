class FindMaxMinOfThree{
	
		
	public static void main(String a[]){
		
		int array[] = {3, 567, 67};
		
		int max = array[0];
		for(int i = 0; i < array.length; i++){
			
			if(array[i] > max)
				max = array[i];
		}
		System.out.println("Maximum among three is :" +max);
		
		int min = array[0];
		for(int j = 0; j < array.length; j++){
			
			if(array[j] < min)
				min = array[j];
		}
		System.out.println("Minimum among three is :" +min);
		
	}

}