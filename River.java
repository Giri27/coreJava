class River{
	
	public String name = "Kaveri";
	public int lengthInKm = 805;
	public String origin = "kodagu";
	public String source;
	
	public River(){
		
		System.out.println("River object is created");	
	}
	
	public String produceElectricity(){
		
		return "produces electricity";
	}
	
	@Override
	public int hashCode(){
		return this.lengthInKm;
	}
	
	@Override
	public boolean equals(Object river){
		if(river instanceof Kaveri){
			Kaveri kaveri1 = (Kaveri)river;
			if(this.hashCode() == kaveri1.hashCode()){
				return true;
			}else{
				return false;
			}
			if(this.name.equals(kaveri1.name)){
				return true;
			}else{
				System.out.println("name is different");
			}
			if(this.lengthInKm == kaveri1.lengthInKm){
				return true;
			}else{
				System.out.println("length is different");
			}
			if(this.origin.equals(kaveri1.origin)){
				return true;
			}else{
				System.out.println("origin is different");
			}
			if(this.source.equals(kaveri1.source)){
				return true;
			}else{
				System.out.println("source is different");
			}
		}else{
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}
}