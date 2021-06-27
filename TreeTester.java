class TreeTester{
	
	public static void main(String a[]){
		
		Tree tree = new Tree("Neem", 200, "4metre", 3f);
		tree.getTreeDetails();
		
		Tree tr = new Tree("Pine", 1000, "1metre", 4.5f);
		tr.getTreeDetails();
		
		Tree tre = new Tree("Coconut", 50, "7metre", 15f);
		tre.getTreeDetails();
		
		Tree.providesOxygen();
		
		
		
	}

}