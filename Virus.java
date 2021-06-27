class Virus{
	
	String virusName;
	String diseaseName;
	String symptoms;
	
	
	public Virus(String virusName, String diseaseName, String symptoms){
		
		this.virusName = virusName;
		this.diseaseName = diseaseName;
		this.symptoms = symptoms;
		
	}
	
	public void getVirusDetails(){
		
		System.out.println(virusName+", "+diseaseName+", "+symptoms);
	}
	
	public static void causeDisease(){
		
		System.out.println();
		
	}

}