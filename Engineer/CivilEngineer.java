class CivilEngineer extends Engineer{
	
	Constants branch = Constants.CIVIL;
	
	@Override
	public void problemSolving(){
		
		System.out.println("Invoked problem Solving of civil Engineer");
		System.out.println("problem solved by " +this.branch);
		
	}
	
	public Constants getBranch(){
		
		return branch;
	}
}

