public class FruitsDTO{
	
	private String name;	
	private double price;
	private String season;
	private int quantityInKg;
	
	public FruitsDTO(){
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public void setSeason(String season){
		this.season = season;
	}
	public String getSeason(){
		return season;
	}
	
	public void setQuantityInKg(int quantityInKg){
		this.quantityInKg = quantityInKg;
	}
	public int getQuantityInKg(){
		return quantityInKg;
	}
	
}