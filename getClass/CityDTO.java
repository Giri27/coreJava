class CityDTO{
	
	private AreaDTO[] areas;
	private String cityName;
	
	public CityDTO(){
		System.out.println(this.getClass().getSimpleName+"created");
	}
	
	public void setAreas(AreaDTO[] areas){
		this.areas = areas;
	}
	public AreaDTO[] getAreas(){
		return areas;
	}
	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	public String getCityName(){
		return cityName;
	}
	
}