class WaterFalls{
	
	static String name = "Niagara";
	static String location = "America";
	static int heightInFt = 7000;
	
	public static String provideElectricity(){
		
		System.out.println(name);
		System.out.println(location);
		System.out.println(heightInFt);
		return "providing electricity";
		
	}
	
	public static void main(String a[]){
		
		String str = provideElectricity();
		System.out.println(str);
	}

}