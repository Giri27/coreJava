class SuperMarket{
		
	public static void main(String args[]){
		
		String perfume[] = {"Axe", "Nivea", "Wild stone", "Secret", "Watergirl", "Yardley", "Fogg", "Engage", "Gucci", "Miss dior", "Giordini"};
		int pricePerBottle[] = {130, 180, 150, 200, 160, 190, 210, 190, 300, 450, 800};
		System.out.println("Number of perfume brands :" +perfume.length);
		String allPerfumes[] = getPerfumesAndPrices(perfume, pricePerBottle);
		for(String p : allPerfumes)
			System.out.println(p);
				
		String vegAndFruits[] = {"Beetroot", "DragonFruit", "Capsicum", "Strawberry", "Potato", "Grapes", "Pumpkin", "Litchi", "Cucumber", "Orange", "MuskMelon"};
		int amountPerkg[] = {30,60,45,100,20,50,40,120,30,50,55};
		System.out.println();
		System.out.println("Number od items :" +vegAndFruits.length);
		String total[] = getVegFruitsAndPrices(vegAndFruits, amountPerkg);
		for(String s : total)
			System.out.println(s);
				
		String cereals[] = {"Wheat", "Maize", "Rice", "Barley", "Oats", "Millet"};
		int pricePerPacket[] = {80, 60, 85, 90, 45, 50};
		System.out.println();
		System.out.println("Number of cereals :" +cereals.length);
		String allCereals[] = getCerealsAndPrices(cereals, pricePerPacket);
		for(String c : allCereals)
			System.out.println(c);
				
		String biscuits[] = {"Oreo", "Bourboun", "Treat", "DarkFantasy", "MarieGold", "Parle-G", "Unibic"};
		int amtPerPacket[] = {10, 15, 5, 20, 12, 4, 15};
		System.out.println();
		System.out.println("Number of biscuit brands :" +biscuits.length);
		String allBiscuits[] = getBiscuitsAndPrices(biscuits, amtPerPacket);
		for(String bs : allBiscuits)
			System.out.println(bs);
		
		String chocolate[] = {"DairyMilk", "Snickers", "5-Star", "Kit-Kat", "Fuse", "Munch"};
		int pricePerChocolate[] = {20, 30, 15, 20, 25, 10};
		System.out.println();
		System.out.println("Number of chocolate brands :" +chocolate.length);
		String allchocolates[] = getChocolatesAndPrice(chocolate, pricePerChocolate);
		for(String cc : allchocolates)
			System.out.println(cc);
		
		String jam[] = {"Kissan", "NatureLand", "Smuckers", "Hartleys", "MD", "Manama"};
		int amtPerBottle[] = {80, 120, 90, 95, 110, 100};
		System.out.println();
		System.out.println("Number of jam brands :" +jam.length);
		String allJam[] = getJamAndPrice(jam, amtPerBottle);
		for(String j : allJam)
			System.out.println(j);
				
		String soap[] = {"Dove", "Santoor", "Dettol", "LifeBoy", "Medimix", "Lux"};
		int pricePerPiece[] = {85, 40, 35, 37, 25, 30};
		System.out.println();
		System.out.println("Number of soap brands :" +soap.length);
		String allSoap[] = getSoapAndPrices(soap, pricePerPiece);
		for(String sp : allSoap)
			System.out.println(sp);
		
		String accessories[] = {"comb", "Mirror", "Towel", "DoorMat", "Mop"};
		int pricePerItem[] = {40, 250, 150, 100, 180};
		System.out.println();
		System.out.println("Number of accessories :" +accessories.length);
		String allAccessories[] = getaccessoriesAndPrices(accessories, pricePerItem);
		for(String acs : allAccessories)
			System.out.println(acs);
		
		String cookingOil[] = {"Gemini", "Sunrich", "Saffola", "Fortune", "Sundrop", "Nutrela"};
		int amtPerLitre[] = {190, 180, 200, 210, 185, 170};
		System.out.println();
		System.out.println("Number of brands :" +cookingOil.length);
		String allCookingOil[] = getCookingOilAndAmt(cookingOil, amtPerLitre);
		for(String co : allCookingOil)
			System.out.println(co);
		
		String iceCreams[] = {"Amul", "Arun", "KwalityWalls", "Havmor", "Hangya"};
		int pricePerIce[] = {60, 120, 50, 45, 55};
		System.out.println();
		System.out.println("Number of Ice-Cream brands :" +iceCreams.length);
		String allIceCreams[] = getIceCreamsAndPrices(iceCreams, pricePerIce);
		for(String ic : allIceCreams)
			System.out.println(ic);
		
		String coolDrinks[] = {"MountainDew", "Mirinda", "Sprite", "CoCa-Cola", "Pepsi", "Bindu-jeera"};
		int pricePerCoolDrinksBottle[] = {40, 35, 37, 40, 30, 25};
		System.out.println();
		System.out.println("Number of coolDrinks brands :" +coolDrinks.length);
		String allCoolDrinks[] = getCoolDrinksAndPrices(coolDrinks, pricePerCoolDrinksBottle);
		for(String cd : allCoolDrinks)
			System.out.println(cd);
		
		
		String proteinShakes[] = {"Proteinx", "Whey", "Ensure", "EnduraMass", "CorePower", "Xante"};
		int pricePerBox[] = {210, 250, 200, 300, 360, 290};
		System.out.println();
		System.out.println("Number of proteinShakes brands :" +proteinShakes.length);
		String allProteinShakes[] = getProteinShakesAndPrices(proteinShakes, pricePerBox);
		for(String ps : allProteinShakes)
			System.out.println(ps);
	}
	
	public static String[] getPerfumesAndPrices(String perfumes[], int price[]){
		String totalPerfumes[] = new String[perfumes.length];
		for(int i=0; i < perfumes.length; i++){
			perfumes[i] = perfumes[i] +" amount is "+ price[i];					
			totalPerfumes[i] = perfumes[i];
		}
		return totalPerfumes;
	}
	
	public static String[] getVegFruitsAndPrices(String veggie[], int amt[]){
		String totalVeggie[] = new String[veggie.length];
		for(int j=0; j < veggie.length; j++){
				veggie[j] = veggie[j] +" amount is "+ amt[j];
				totalVeggie[j] = veggie[j];
		}
		return totalVeggie;
	}
	
	public static String[] getCerealsAndPrices(String cereal[], int amount[]){
		String totalCereals[] = new String[cereal.length];
		for(int a=0; a < cereal.length; a++){
			cereal[a] = cereal[a] +" amount is "+ amount[a];
			totalCereals[a] = cereal[a];
		}
		return totalCereals;
	}
	
	public static String[] getBiscuitsAndPrices(String biscuit[], int amt[]){
		String totalBiscuits[] = new String[biscuit.length]; 
		for(int b=0; b < biscuit.length; b++){
			biscuit[b] = biscuit[b] +" amount is "+ amt[b];
			totalBiscuits[b] = biscuit[b];
		}
		return totalBiscuits;
	}
	
	public static String[] getChocolatesAndPrice(String chocolates[], int amt[]){
		String totalChocolates[] = new String[chocolates.length];
		for(int c=0; c < chocolates.length; c++){
			chocolates[c] = chocolates[c] +" amount is "+ amt[c];
			totalChocolates[c] = chocolates[c];
		}
		return totalChocolates;
	}
	
	public static String[] getJamAndPrice(String jams[], int amount[]){
		String totalJams[] = new String[jams.length];
		for(int d=0; d < jams.length; d++){
			jams[d] = jams[d] +" amount is "+ amount[d];
			totalJams[d] = jams[d];
		}
		return totalJams;
	}
	
	public static String[] getSoapAndPrices(String soaps[], int price[]){
		String totalSoap[] = new String[soaps.length];
		for(int e=0; e < soaps.length; e++){
			soaps[e] = soaps[e] +" amoungt is "+ price[e];
			totalSoap[e] = soaps[e];
		}
		return totalSoap;
	}
	
	public static String[] getaccessoriesAndPrices(String accessr[], int price[]){
		String totalAccessories[] = new String[accessr.length];
		for(int e=0; e < accessr.length; e++){
			accessr[e] = accessr[e] +" amoungt is "+ price[e];
			totalAccessories[e] = accessr[e];
		}
		return totalAccessories;
	}
	
	public static String[] getCookingOilAndAmt(String ckgOil[], int amount[]){
		String totalCookingOil[] = new String[ckgOil.length];
		for(int e=0; e < ckgOil.length; e++){
			ckgOil[e] = ckgOil[e] +" amoungt is "+ amount[e];
			totalCookingOil[e] = ckgOil[e];
		}
		return totalCookingOil;
	}
	
	public static String[] getIceCreamsAndPrices(String ice[], int price[]){
		String totalIceCreams[] = new String[ice.length];
		for(int i=0; i < ice.length; i++){
			ice[i] = ice[i] +" amount is "+ price[i];					
			totalIceCreams[i] = ice[i];
		}
		return totalIceCreams;
	}
	
	public static String[] getCoolDrinksAndPrices(String drinks[], int price[]){
		String totalCoolDrinks[] = new String[drinks.length];
		for(int i=0; i < drinks.length; i++){
			drinks[i] = drinks[i] +" amount is "+ price[i];					
			totalCoolDrinks[i] = drinks[i];
		}
		return totalCoolDrinks;
	}
	
	public static String[] getProteinShakesAndPrices(String ppowder[], int price[]){
		String totalProteinShakes[] = new String[ppowder.length];
		for(int i=0; i < ppowder.length; i++){
			ppowder[i] = ppowder[i] +" amount is "+ price[i];					
			totalProteinShakes[i] = ppowder[i];
		}
		return totalProteinShakes;
	}


}