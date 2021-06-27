class VirusTester{
	
	public static void main(String a[]){
		
		Virus virus = new Virus("Coronavirus", "COVID-19", "(DryCough,Fatigue,Fever)");
		virus.getVirusDetails();
		
		Virus vir = new Virus("Zika virus", "Zikavirus", "(Fever,Red eyes,Headache)");
		vir.getVirusDetails();
		
		Virus virs = new Virus("Ebola", "EVD", "(Sore throat,Weakness,Fever,Headache)");
		virs.getVirusDetails();
		
		Virus vrus = new Virus("RNA virus", "Rabies", "(Incubation, acute neurologic period, coma)");
		vrus.getVirusDetails();
		
		Virus.causeDisease();
		
	}

}