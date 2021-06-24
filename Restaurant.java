class Restaurant{
	
	String restaurantName;
	String area;
	String foodTaste;
	boolean isBreakfastAvailable;
	float restaurantRating;
	
	public static void main(String a[]){
		
		Restaurant res = new Restaurant();
		res.restaurantName = "The Bangalore Bresserie";
		res.area = "MG Road";
		res.foodTaste = "Good";
		res.isBreakfastAvailable = false;
		res.restaurantRating = 4.4f;
		System.out.println(res.restaurantName+", "+res.area+", "+res.foodTaste+", "+res.isBreakfastAvailable+", "+res.restaurantRating);
		
		Restaurant rest = new Restaurant();
		rest.restaurantName = "Persian Terrace";
		rest.area = "Rajkumar road, Malleshwaram";
		rest.foodTaste = "Average";
		rest.isBreakfastAvailable = true;
		rest.restaurantRating = 4.3f;
		System.out.println(rest.restaurantName+", "+rest.area+", "+rest.foodTaste+", "+rest.isBreakfastAvailable+", "+rest.restaurantRating);
		
		Restaurant restnt = new Restaurant();
		restnt.restaurantName = "The Bangalore cafe";
		restnt.area = "KH road";
		restnt.foodTaste = "Better";
		restnt.isBreakfastAvailable = false;
		restnt.restaurantRating = 4.2f;
		System.out.println(restnt.restaurantName+", "+restnt.area+", "+restnt.foodTaste+", "+restnt.isBreakfastAvailable+", "+restnt.restaurantRating);
		
		Restaurant restut = new Restaurant();
		restut.restaurantName = "Shiro";
		restut.area = "Vittal Mallya road";
		restut.foodTaste = "Good";
		restut.isBreakfastAvailable = true;
		restut.restaurantRating = 4.3f;
		System.out.println(restut.restaurantName+", "+restut.area+", "+restut.foodTaste+", "+restut.isBreakfastAvailable+", "+restut.restaurantRating);
	}

}