class River{
	
	public String name = "Kaveri";
	public int lengthInKm = 805;
	public String origin = "kodagu";
	
	public River(){
		
		System.out.println("River object is created");	
	}
	
	public String produceElectricity(){
		
		return "produces electricity";
	}
	
	@Override
	public boolean equals(Object type){
		if(type instanceof River){
			return true;
		}
		return false;
	}
}