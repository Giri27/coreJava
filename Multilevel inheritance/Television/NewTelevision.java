class NewTelevision extends Television{
	
	public NewTelevision(int tvId, double price){
		
		System.out.println("New television object is created");
		this.tvId = tvId;
		this.price = price;
	}
	
	public void led(){
		
		System.out.println("led's are the advanced televisions");
	}

}