public class TableDTO{
	
	private int tableId;
	private double price;
	private String tableType;
	
	public TableDTO(){
		
	}
	
	public void setTableId(int tableId){
		this.tableId = tableId;
	}
	public int getTableId(){
		return tableId;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public void setTableType(String tableType){
		this.tableType = tableType;
	}
	public String getTableType(){
		return tableType;
	}
	
}