class Processor{
	
	public static void saveProcessor(String processorBrand, String processorNo, String launchedDate, boolean is64BitAvailable,int cacheINMb){
		
		System.out.println(processorBrand);
		System.out.println(processorNo);
		System.out.println(launchedDate);
		System.out.println(is64BitAvailable);
		System.out.println(cacheINMb);
		
	}
	
	public static void main(String a[]){
		
		saveProcessor("IntelCoreDuo", "T600", "01/01/2009", true, 2);
		saveProcessor("IntelCore", "10105F", "12/09/2020", false, 6);
		saveProcessor("AMD RYZEN", "5600X", "11/05/2020", true, 32);
		saveProcessor("Pentium", "P4", "20/11/2000",false, 4);
		saveProcessor("Apple", "A14", "16/09/2020", true, 20);
		
	
	}

}