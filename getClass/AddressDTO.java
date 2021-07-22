class AddressDTO{

	private CountryDTO[] country;
	
	
	public AdressDTO(){
		address = new AddressDTO[];	
		System.out.println(this.getClass().getSimpleName+"created");
	}
	
	public void setCountries(CountryDTO[] countries){
		this.countries = countries;
	}
	
	public CountryDTO[] getCountries(){
		return countries;
	}
	
	
}