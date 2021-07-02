class OldTelevision extends Television{
	
	public OldTelevision(int tvId, double price){
		
		System.out.println("Old television object is created");
		this.tvId = tvId;
		this.price = price;
	}
	
	public void moreSpace(){
		
		System.out.println("Old television are bigger in size");
	}
	
	public void crt(){
		
		System.out.println("old televisions are cathode ray tube televisions");
	}

}