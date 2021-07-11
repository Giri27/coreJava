class Continent{
	
	int id;
	int noOfCountries;
	String population;
	
	public Continent(){
		System.out.println("Continent object is created");
	}
	
	public void develop(){
		System.out.println();
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setNoOfCountries(int noOfCountries){
		this.noOfCountries = noOfCountries;
	}
	public int getNoOfCountries(){
		return noOfCountries;
	}
	
	public void setPopulation(String population){
		this.population = population;
	}
	public String getPopulation(){
		return population;
	}
	
}