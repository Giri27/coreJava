class Engineer{
	
	public String USN;
	public Constants branch = Constants.ARCH;
	
	public void problemSolving(){
		
		System.out.println("Invoked problem Solving in Engineer");
		System.out.println("problem solved");
	
	}
	
	//Setter Initialization
	public void setUSN(String USN){
		
		this.USN = USN;
	}
	
	//Getter method
	public String getUSN(){
		
		return USN;
	}
	
	//Getter method
	public Constants getBranch(){
		return branch;
	}
}