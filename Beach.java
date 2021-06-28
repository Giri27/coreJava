class Beach{
	
	String name;
	String location;
	String district;;
	float area;
	int humidityInPercent;
	int weatherInDegCelsius;
	
	public Beach(){
		this("Om Beach");
		System.out.println("Starting Constructor with zero parameter");
		System.out.println(this.name+", "+this.location+", "+this.district+", "+this.area+", "+this.humidityInPercent+", "+this.weatherInDegCelsius);
		System.out.println("Ending constructor with zero parameter");
	}
	
	public Beach(String name){
		this("Gokarna", "Uttara Kannada");
		System.out.println("Starting Constructor with one parameter");
		this.name = name;
		System.out.println("Ending constructor with one parameter");
	}
	
	public Beach(String location, String district){
		this(89, 27, 10.9f);
		System.out.println("Starting Constructor with two parameters");
		this.location = location;
		this.district = district;
		System.out.println("Ending Constructor with two parameters");
	}
	
	public Beach(int humidityInPercent, int weatherInDegCelsius, float area){
		
		System.out.println("Starting Constructor with three parameters");
		this.humidityInPercent = humidityInPercent;
		this.weatherInDegCelsius = weatherInDegCelsius;
		this.area = area;
		System.out.println("Ending Constructor with three parameters");
	}
	
	public static void enjoy(){
		
	}

}