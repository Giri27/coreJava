class Dam{
	
	public String location = "Mandya";
	public double heightInMetre = 39.8;
	public String surfaceArea = "129sqkm";
	public int lengthInMetre;
	
	public Dam(){
		System.out.println("Dam object is created");
	}
	
	public Number activeCapacityInCubicMetre(){
		return 124421000;
	}
	
	@Override
	public int hashCode(){
		return lengthInMetre;
	}
	
	@Override
	public boolean equals(Object dam){
		if(dam instanceof KRS){
			KRS krs1 = (KRS)dam;
			if(this.hashCode()== krs1.hashCode()){
				return true;
			}
			if(this.location.equals(krs1.location)){
				System.out.println("location is different");
			}else{
				return false;
			}
			if(this.heightInMetre == krs1.heightInMetre){
				System.out.println("heights are different");
			}else{
				return false;
			}
			if(this.surfaceArea.equals(krs1.surfaceArea)){
				System.out.println("surface area is different");
			}else{
				return false;
			}
			if(this.lengthInMetre == krs1.lengthInMetre){
				System.out.println("length is different");
			}else{
				return false;
			}
		}else{
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}
}