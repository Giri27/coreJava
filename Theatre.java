class Theatre{
	
	String name;
	String location;
	int noOfSeats;
	int showsPerDay;
	
	public Theatre(){
		this("Siddeshwar");
		System.out.println("Constructor with zero parameter");
		System.out.println(this.name+", "+this.location+", "+this.noOfSeats+", "+this.showsPerDay);
		
	}
	
	public Theatre(String name){
		this("Bangalore", 350, 3);
		System.out.println("Constructor with one parameter");
		this.name = name;
	}
	
	public Theatre(String location, int noOfSeats, int showsPerDay){
		System.out.println("Constructor with three parameters");
		this.location = location;
		this.noOfSeats = noOfSeats;
		this.showsPerDay = showsPerDay;
		
	}
	
	public void entertainment(){
		
	}
}