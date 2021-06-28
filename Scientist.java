class Scientist{
	
	String name;
	String fields;
	String born;
	boolean isAlive;
	
	public Scientist(){
		this("Stephen Hawking", "General relativity, Quantum gravity");
		System.out.println("Constructor with no parameter");
		System.out.println(this.name+", "+this.fields+", "+this.born+", "+this.isAlive);
		System.out.println("Ending constructor with no parameter");
		
	}
	
	public Scientist(String name, String fields){
		this("8th jan 1942", false);
		System.out.println("Constructor with two string parameter");
		this.name = name;
		this.fields = fields;
		System.out.println("Ending constructor with two string parameter");
	}
	
	public Scientist(String born, boolean isAlive){
		
		System.out.println("Constructor with parameters string and boolean");
		this.born = born;
		this.isAlive = isAlive;
		System.out.println("Ending constructor with parameters string and boolean");
	}
	
	public static void invention(){
		System.out.println();
		
	}

}