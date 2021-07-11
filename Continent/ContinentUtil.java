class ContinentUtil{
	
	public static void main(String a[]){
		
		Continent continent = new Continent();
		continent.setId(67);
		continent.setNoOfCountries(49);
		continent.setPopulation("456 crores");
		System.out.println(continent.getId()+", "+ continent.getNoOfCountries()+", "+ continent.getPopulation());
		
		Asia asia = new Asia();
		asia.setId(67);
		asia.setNoOfCountries(49);
		asia.setPopulation("456 crores");
		System.out.println(asia.getId()+", "+ asia.getNoOfCountries()+", "+ asia.getPopulation());
		
		Continent cont = new Asia();
		cont.setId(67);
		cont.setNoOfCountries(49);
		cont.setPopulation("456 crores");
		System.out.println(cont.getId()+", "+ cont.getNoOfCountries()+", "+ cont.getPopulation());
	}

}