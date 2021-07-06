class AeroEngineer extends Engineer{
	
	Constants branch = Constants.AERO;
	
	@Override
	public void problemSolving(){
		
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem Solving method of "+this.branch);
		System.out.println("problem solved by "+this.branch);
	}
	
	public Constants getBranch(){
		
		return branch;
	}

}