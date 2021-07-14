class MsDhoni extends Cricketer{
	
	public String bornOn = "7th July 1981";
	public String role = "Wicket keeper, Batsman";
	public int shirtNo = 7;
	
	public MsDhoni(){
		System.out.println("MsDhoni object is created");
	}
	
	@Override
	public int numberOfPlayersInTeam(){
		return 11;
	}
	
	public void displayDetails(){
		System.out.println(super.sports);
		System.out.println(this.bornOn);
		System.out.println(this.role);
		System.out.println(this.shirtNo);
	}
}