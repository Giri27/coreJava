class Kaveri extends River{
	
	public String source = "TalaKaveri";
	
	public Kaveri(){
		System.out.println("Kaveri object created");
	}
	
	@Override
	public String produceElectricity(){
		return "produces electricity";
	}
	
	public void displayDetails(){
		System.out.println(super.name);
		System.out.println(super.lengthInKm);
		System.out.println(super.origin);
		System.out.println(this.source);
	}
	
}