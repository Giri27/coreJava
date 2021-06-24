class CountryTester{
	
	public static void main(String a[]){
		
		Country country = new Country();
		country.name = "India";
		country.noOfStates = 30;
		country.population = 1300000000L;
		country.noOfUnionTerritories = 9;
		System.out.println(country.name+", "+country.noOfStates+", "+country.population+", "+country.noOfUnionTerritories);
		
		Country cntry = new Country();
		cntry.name = "Russia";
		cntry.noOfStates = 23;
		cntry.population = 1440000000L;
		cntry.noOfUnionTerritories = 9;
		System.out.println(cntry.name+", "+cntry.noOfStates+", "+cntry.population+", "+cntry.noOfUnionTerritories);
		
		Country cntr = new Country();
		cntr.name = "Australia";
		cntr.noOfStates = 6;
		cntr.population = 255000000L;
		cntr.noOfUnionTerritories = 2;
		System.out.println(cntr.name+", "+cntr.noOfStates+", "+cntr.population+", "+cntr.noOfUnionTerritories);
		
		Country ctry = new Country();
		ctry.name = "China";
		ctry.noOfStates = 23;
		ctry.population = 1439323776L;
		ctry.noOfUnionTerritories = 2;
		System.out.println(ctry.name+", "+ctry.noOfStates+", "+ctry.population+", "+ctry.noOfUnionTerritories);
		
		Country contry = new Country();
		contry.name = "France";
		contry.noOfStates = 18;
		contry.population = 65273511L;
		contry.noOfUnionTerritories = 8;
		System.out.println(contry.name+", "+contry.noOfStates+", "+contry.population+", "+contry.noOfUnionTerritories);
		
		Country.giveCitizenShip();
		Country.develop();
	}

}