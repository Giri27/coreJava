class AreaDTO{
		
	private StreetDTO[] streets;
	private String areaName;
	
	public AreaDTO(){
		System.out.println(this.getClass().getSimpleName+"created");
	}
	
	public void setStreets(StreetDTO[] streets){
		this.streets = streets;
	}
	public StreetDTO[] getStreets(){
		return streets;
	}
	
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	public String getAreaName(){
		return areaName;
	}
}