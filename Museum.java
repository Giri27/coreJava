class Museum{
	
	String name;
	int museumSpaceInSqft;
	String museumType;
	
	public Museum(String name, int museumSpaceInSqft, String museumType){
		
		this.name = name;
		this.museumSpaceInSqft = museumSpaceInSqft;
		this.museumType = museumType;
		
	}
	
	public void getMuseumDetails(){
		
		System.out.println(name+", "+museumSpaceInSqft+", "+museumType);
		
	}
	
	public static void exhibhition(){
		
		System.out.println();
		
	}

}