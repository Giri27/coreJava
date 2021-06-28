class Apartment{
	
	String name;
	String sizes;
	String area;
	String place;
	String startingPrice;
	
	public Apartment(){
		this("1866sqft-2235sqft", "68Lakh");
		System.out.println("Starting constructor with zero parameter");
		System.out.println();
		System.out.println("Ending constructor with zero parameter");
	}
	
	public Apartment(String name, String area, String place){
		this();
		System.out.println("Starting constructor with three parameter");
		this.name = name;
		this.area = area;
		this.place = place;
		System.out.println("Ending constructor with three parameter");
	}
	
	public Apartment(String sizes, float startingPrice){
		this("DSMAX SKYSCAPE Overview", "Hennur main road", "Bangalore");
		System.out.println("Starting constructor with two parameter");
		this.sizes = sizes;
		this.startingPrice = startingPrice;
		System.out.println("Ending constructor with two parameter");
	}
	
	public void stay(){
		
	}
	

}