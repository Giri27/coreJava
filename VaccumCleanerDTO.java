public class VaccumCleanerDTO{
	
	private String brand;
	private double price;
	private String voltage;
	
	public VaccumCleanerDTO(){
		
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public void setVoltage(String voltage){
		this.voltage = voltage;
	}
	public String getVoltage(){
		return voltage;
	}
}