class Cricket extends Sport{
	
	public Cricket(){
		System.out.println("Cricket object is created");
	}
	
	@Override
	public void representsCountry(){
		System.out.println("method invoked in cricket");
	}

}