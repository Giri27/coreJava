class Dam{
	
	public String location = "Mandya";
	public double heightInMetre = 39.8;
	public String surfaceArea = "129sqkm";
	
	public Dam(){
		System.out.println("Dam object is created");
	}
	
	public Number activeCapacityInCubicMetre(){
		return 124421000;
	}
	
	@Override
	public boolean equals(Object type){
		if(type instanceof KRS){
			return true;
		}
		return false;
	}
}