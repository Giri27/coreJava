class Tree{
	
	String name;
	int longevityInYears;
	String growthRateInFiveYears;
	float girthInCm;
	
	public Tree(String name, int longevityInYears, String growthRateInFiveYears, float girthInCm){
		
		this.name = name;
		this.longevityInYears = longevityInYears;
		this.growthRateInFiveYears = growthRateInFiveYears;
		this.girthInCm = girthInCm;
		
	}
	
	public void getTreeDetails(){
		
		System.out.println(name+", "+longevityInYears+", "+growthRateInFiveYears+", "+girthInCm);
		
	}
	
	public static void providesOxygen(){
		
		System.out.println();
		
	}

}