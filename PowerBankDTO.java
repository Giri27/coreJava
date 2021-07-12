public class PowerBankDTO{
	
	private String brand;
	private double price;
	private String batteryCapacity;
	
	public PowerBankDTO(){
		
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
	
	public void setBatteryCapacity(String batteryCapacity){
		this.batteryCapacity = batteryCapacity;
	}
	public String getBatteryCapacity(){
		return batteryCapacity;
	}

}