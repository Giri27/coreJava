import java.util.Scanner;

class SpriteUtil{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter softdrink id");
		int softDrinkId = sc.nextInt();
		
		System.out.println("Enter the price");
		float price = sc.nextFloat();
		
		Sprite sd = new Sprite();
		sd.softDrinkId = softDrinkId;
		sd.price = price;
		
		System.out.println(sd.softDrinkId +", "+ sd.price);
		
	}

}