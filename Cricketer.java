class Cricketer{
	
	public String sports = "Cricket";
	public String bornOn;
	public String role = "All rounder";
	public int shirtNo = 9;
	
	public Cricketer(){
		System.out.println("Athlete object is created");
	}
	
	public int numberOfPlayersInTeam(){
		return 11;
	}
	
	@Override
	public int hashCode(){
		return this.shirtNo;
	}
		
	@Override
	public boolean equals(Object ckt){
		if(ckt instanceof MsDhoni){
			MsDhoni ckt1 = (MsDhoni)ckt;
			if(this.hashCode() == ckt1.hashCode()){
				return true;
			}
			if(this.sports.equals(ckt1.sports)){
				return true;
			}else{
				System.out.println("Not a same type of sports");
			}
			if(this.bornOn.equals(ckt1.bornOn)){
				return true;
			}else{
				System.out.println("birth date are different");
			}
			if(this.role.equals(ckt1.role)){
				return true;
			}else{
				System.out.println("roles are different");
			}
			if(this.shirtNo == ckt1.shirtNo){
				return true;
			}else{
				System.out.println("shirt number is different");
			}
		}else{
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}		
}