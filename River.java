class River{
	
	public String name;
	public int lengthInKm;
	public String origin;
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
	public boolean equals(Object rir){
		if(rir instanceof River){
			River obj = (River)rir;
			if(this.hashCode() == obj.hashCode()){
				return true;
			}
			if(this.name.equals(obj.name)){
				return true;
			}else{
				System.out.println("name is different");
			}
			if(this.lengthInKm == obj.lengthInKm){
				return true;
			}else{
				System.out.println("length is different");
			}
			if(this.origin.equals(obj.origin)){
				return true;
			}else{
				System.out.println("origin is different");
			}
			if(this.source.equals(obj.source)){
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