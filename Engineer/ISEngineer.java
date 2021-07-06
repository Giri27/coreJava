class ISEngineer extends Engineer{
	
	Constants branch = Constants.IS;
	
	@Override
	public void problemSolving(){
		
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem solving method of " +this.branch);
		System.out.println("problem solved by " +this.branch);
	}
	
	public Constants getBranch(){
		
		return branch;
	}

}