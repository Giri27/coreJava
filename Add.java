class Add{

	public static int add(int a,int b){
		return (a+b);
	}
	
	public static void add(int x, int y, int z){
		int res = x+y+z;
		System.out.println(res);
	}
	
	public static void main(String a[]){
		add(6,7);
		add(56,8,6);
	}

}