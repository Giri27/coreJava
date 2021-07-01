import java.util.Scanner;

class MaggiUtil{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the food id");
		int foodId = sc.nextInt();
		System.out.println("Enter the price");
		float price = sc.nextFloat();
		
		
		Maggi maggi = new Maggi();
		maggi.foodId = foodId;
		maggi.price = price;
		
		maggi.eating();
		
		System.out.println(maggi.foodId +", "+ maggi.price );
		
		
	}

}