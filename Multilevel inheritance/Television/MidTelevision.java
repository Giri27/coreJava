class MidTelevision extends Television{
	
	public MidTelevision(int tvId, double price){
		
		System.out.println("MidTelevision object is created");
		this.tvId = tvId;
		this.price = price;
	}
	
	public void lcd(){
		
		System.out.println("lcd's came after crt television");
	}

}