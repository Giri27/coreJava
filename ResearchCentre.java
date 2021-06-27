class ResearchCentre{
	
	String name;
	String type;
	int establishedInTheyear;
	String founder;
	
	public ResearchCentre(String name, String type, int establishedInTheyear, String founder){
		
		this.name = name;
		this.type = type;
		this.establishedInTheyear = establishedInTheyear;
		this.founder = founder;
		
	}
	
	public void getResearchCentreDetails(){
		
		System.out.println(name+", "+type+", "+establishedInTheyear+", "+founder);
	}
	
	public static void research(){
		
		System.out.println();
	}

}