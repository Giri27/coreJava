class CSEngineer extends Engineer{
	
	Constants branch = Constants.CS;
	
	@Override
	public void problemSolving(){
		
		super.problemSolving();
		super.getUSN();
		System.out.println("Invoked problem solving method of " +this.branch);
	}

	public void coding(){
		System.out.println("Invoked coding in CS");
	}
	
	public Constants getBranch(){
		return branch;
	}
}