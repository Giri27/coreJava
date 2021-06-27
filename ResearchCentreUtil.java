class ResearchCentreUtil{
	
	public static void main(String a[]){
		
		ResearchCentre rc = new ResearchCentre("ISRO", "Space Agency", 1969, "Vikram Sarabhai"); 
		rc.getResearchCentreDetails();
		
		ResearchCentre researchc = new ResearchCentre("Jawahaelal Nehru Centre", "Autonomus government institute", 1989, "Prof. C N Rao");
		researchc.getResearchCentreDetails();
		
		ResearchCentre rcentre = new ResearchCentre("Raman Research Centre", "Research Institution", 1948, "C V Raman");
		rcentre.getResearchCentreDetails();
		
		ResearchCentre rsc = new ResearchCentre("Tata Institute of Fundamental Research", "Public research university", 1945, "Homi J.Bhabha");
		rsc.getResearchCentreDetails();
		
		ResearchCentre.research();
		
	}
}