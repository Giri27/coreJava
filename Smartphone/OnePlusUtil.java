import java.util.Scanner;

class OnePlusUtil{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter smartphone model");
		String model = sc.nextLine();
		
		System.out.println("Enter the smartphone id");
		int smartPhoneId = sc.nextInt();
		
		System.out.println("Enter the price");
		float price = sc.nextFloat();
		
		OnePlus op = new OnePlus();
		
		op.smartPhoneId = smartPhoneId;
		op.price = price;
		op.model = model;
		
		System.out.println(op.smartPhoneId +", "+ op.model +", "+ op.price);
	}

}