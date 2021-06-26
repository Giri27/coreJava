class CupTester{
	
	public static void main(String a[]){
	
	Cup cup = new Cup("Nikarsh", "Ceramic", 999);
	cup.getCupDetails();
	
	Cup cu = new Cup("Shopeum", "Steel", 890);
	cu.getCupDetails();
	
	Cup cp = new Cup("Zylam", "Glass", 2050);
	cp.getCupDetails();
	
	Cup.drinkingTeaOrCoffee();

	}
}