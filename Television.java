class Television{
	
	public static void latestTelevisionModels(String  brand, String model, double sizeInInches, boolean isAndroid, double price){
		
		System.out.println(brand);
		System.out.println(model);
		System.out.println(sizeInInches);
		System.out.println(isAndroid);
		System.out.println(price);
		
	}

	public static void main(String a[]){
		
		latestTelevisionModels("Sony Bravia", "KD-55X7002", 55.00, false, 109900.00);
		latestTelevisionModels("LG", "55UM729", 55.00, false, 83990.00);
		latestTelevisionModels("OnePlus", "55Q1", 55.00, true, 62899.00);
		latestTelevisionModels("Redmi", "L55M6-RA", 50.00, true, 50000.00);
	
	
	}
}