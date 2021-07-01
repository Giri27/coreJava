import java.util.Scanner;

class TabletUtil{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter medicine type");
		String medicineType = sc.nextLine();
		
		System.out.println("Enter manufacturing date");
		String mfgDate = sc.nextLine();
		
		System.out.println("Enter expiry date");
		String expiryDate = sc.nextLine();
		
		System.out.println("Enter the medicine id");
		int medicineId = sc.nextInt();
		
		System.out.println("Enter medicine price");
		float price = sc.nextFloat();
		
		Tablet tablet = new Tablet();
		tablet.medicineId = medicineId;
		tablet.medicineType = medicineType;
		tablet.mfgDate = mfgDate;
		tablet.expiryDate = expiryDate;
		tablet.price = price;
		
		Tablet.curesDisease();
		
		System.out.println(tablet.medicineId +", "+ tablet.medicineType +", "+ tablet.mfgDate +", "+ tablet.expiryDate +", "+tablet.price); 
	}

}