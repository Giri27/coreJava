class Fibonacci{
	
	public static void fibonacciSeries(int a, int b, int n){
		
		for(int i = 1; i <= n; i++){
				int c = a+b;
				System.out.println("Fibonacci Series till :" +c);
				a=b;
				b=c;
		}
	}
	
	
	public static void main(String args[]){
		
		int x;
		int y;
		int number;
		fibonacciSeries(0, 1, 10);
	}

}