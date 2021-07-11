class Sport{
	
	int sportId;
	int noOfTeamPlayers;
	String gameType;
	
	public void representsCountry(){
		System.out.println("method invoked in Sport");
	}
	
	public Sport(){
		System.out.println("Sport object is created");
	}
	
	public void setSportId(int sportId){
		this.sportId = sportId;;
	}
	public int getSportId(){
		return sportId;
	}
	
	public void setNoOfTeamPlayers(int noOfTeamPlayers){
		this.noOfTeamPlayers = noOfTeamPlayers;;
	}
	public int getNoOfTeamPlayers(){
		return noOfTeamPlayers;
	}
	
	public void setGameType(String gameType){
		this.gameType = gameType;;
	}
	public String getGameType(){
		return gameType;
	}

}