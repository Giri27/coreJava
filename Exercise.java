class Exercise{
	
	
	
	public Exercise(){
		System.out.println("Exercise object is created");
	}
	
	public Object improvesHealth(){
		return "Exercise helps in improving health";
	}
	
	@Override
	public boolean equals(Object type){
		if(type instanceof Yoga){
			return true;
		}
		return false;
	}
}