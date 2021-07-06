class EngineerTester{
	
	public static void main(String a[]){
		
		Engineer eng = new Engineer();
		eng.setUSN("2BA12CS022");
		eng.problemSolving();
		System.out.println(eng.getUSN());
		
		CSEngineer csEng = new CSEngineer();
		System.out.println(csEng.USN);
		csEng.problemSolving();
		System.out.println(csEng.getBranch());
		
		Engineer engineer = new CSEngineer();
		System.out.println(engineer.getBranch());
		
		CivilEngineer civilEng = new CivilEngineer();
		System.out.println(civilEng.getBranch());
		civilEng.problemSolving();
				
		Engineer engr = new CivilEngineer();
		System.out.println(engr.getBranch());
		
		Engineer ise = new ISEngineer();
		System.out.println(ise.getBranch());
		ise.problemSolving();
		
		Engineer ec = new ECEngineer();
		System.out.println(ec.getBranch());
		ec.problemSolving();
		
		Engineer mech = new MechEngineer();
		System.out.println(mech.getBranch());
		mech.problemSolving();
		
		Engineer aero = new AeroEngineer();
		System.out.println(aero.getBranch());
		aero.problemSolving();
		
		Engineer bt = new BTEngineer();
		System.out.println(bt.getBranch());
		bt.problemSolving();
		
		Engineer chemical = new ChemicalEngineer();
		System.out.println(chemical.getBranch());
		chemical.problemSolving();
		
		Engineer marine = new MarineEngineer();
		System.out.println(marine.getBranch());
		marine.problemSolving();
		
		Engineer robo = new RoboticsEngineer();
		System.out.println(robo.getBranch());
		robo.problemSolving();
	}
}