public class HardDiskDTO{
	
	private String brand;
	private double price;
	private String storage;
	
	public HardDiskDTO(){
		
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
	
	public void setStorage(String storage){
		this.storage = storage;
	}
	public String getStorage(){
		return storage;
	}
}