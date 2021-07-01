import java.util.Scanner;

class CAshwathUtil{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter singer birth date");
		String bornOn = sc.nextLine();
		
		System.out.println("Enter language");
		String language = sc.nextLine();
		
		System.out.println("Enter singer id");
		int singerId = sc.nextInt();
		
		CAshwath cs = new CAshwath();
		cs.singerId = singerId;
		cs.bornOn = bornOn;
		cs.language = language;
		
		System.out.println(cs.singerId +", "+ cs.bornOn +", "+ cs.language);
		
	}

}