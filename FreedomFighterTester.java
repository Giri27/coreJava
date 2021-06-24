class FreedomFighterTester{
	
	public static void main(String a[]){
		
		FreedomFighter ff = new FreedomFighter();
		ff.name = "Mahatma Gandhi";
		ff.birthDate = "2nd October 1869";
		ff.spouseName= "Kasturba Gandhi";
		ff.isStillAlive = false;
		System.out.println(ff.name+", "+ff.birthDate+", "+ff.spouseName+", "+ff.isStillAlive);
		
		FreedomFighter fdm = new FreedomFighter();
		fdm.name = "Subhas Chandra Bose";
		fdm.birthDate = "23rd January 1897";
		fdm.spouseName = "Emilie Schenkl";
		fdm.isStillAlive = false;
		System.out.println(fdm.name+", "+fdm.birthDate+", "+fdm.spouseName+", "+fdm.isStillAlive);
		
		FreedomFighter ffigther = new FreedomFighter();
		ffigther.name = "Bhagat Singh";
		ffigther.birthDate = "28th September 1907";
		ffigther.spouseName = "Unmarried";
		ffigther.isStillAlive = false;
		System.out.println(ffigther.name+", "+ffigther.birthDate+", "+ffigther.spouseName+", "+ffigther.isStillAlive);
		
		FreedomFighter freedomf = new FreedomFighter();
		freedomf.name = "Rani of Jhansi";
		freedomf.birthDate = "19th November 1828";
		freedomf.spouseName = "Raja Gangadhar Rao Newalkar";
		freedomf.isStillAlive = false;
		System.out.println(freedomf.name+", "+freedomf.birthDate+", "+freedomf.spouseName+", "+freedomf.isStillAlive);
		
		FreedomFighter fdmf = new FreedomFighter();
		fdmf.name = "Sarojini Naidu";
		fdmf.birthDate = "13th February 1879";
		fdmf.spouseName = "Muthyala Govindarajulu Naidu";
		fdmf.isStillAlive = false;
		System.out.println(fdmf.name+", "+fdmf.birthDate+", "+fdmf.spouseName+", "+fdmf.isStillAlive);
		
		FreedomFighter.foughtForIndia();
		
	}

}