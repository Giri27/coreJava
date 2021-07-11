class SportUtil{
	
	public static void main(String a[]){
		
		Sport sport = new Sport();
		sport.setSportId(234);
		sport.setNoOfTeamPlayers(11);
		sport.setGameType("Outdoor");
		sport.representsCountry();
		System.out.println(sport.getSportId() +", "+ sport.getNoOfTeamPlayers() +", "+ sport.getGameType());
		
		Cricket cricket = new Cricket();
		cricket.setSportId(234);
		cricket.setNoOfTeamPlayers(11);
		cricket.setGameType("Outdoor");
		cricket.representsCountry();
		System.out.println(cricket.getSportId() +", "+ cricket.getNoOfTeamPlayers() +", "+ cricket.getGameType());
		
		Sport sp = new Cricket();
		sp.setSportId(234);
		sp.setNoOfTeamPlayers(11);
		sp.setGameType("Outdoor");
		sp.representsCountry();
		System.out.println(sp.getSportId() +", "+ sp.getNoOfTeamPlayers() +", "+ sp.getGameType());
		
	}

}