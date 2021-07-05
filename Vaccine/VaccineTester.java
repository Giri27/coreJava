import java.util.Scanner;

class VaccineTester{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vaccine id");
		int vaccineId = sc.nextInt();
		
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		
		Covaxin covaxin = new Covaxin();
		covaxin.vaccineId = vaccineId;
		covaxin.price = price;
		
		System.out.println(covaxin.vaccineId +", "+ covaxin.price);
		
		Sputnik sput = new Sputnik();
		sput.vaccineId = vaccineId;
		sput.price = price;
		
		System.out.println(sput.vaccineId +", "+ sput.price);
		
		CoviShield covi = new CoviShield();
		covi.vaccineId = vaccineId;
		covi.price = price;
		
		System.out.println(covi.vaccineId +", "+ covi.price);
		
		Vaccine vc = new Covaxin();
		vc.vaccineId = vaccineId;
		vc.price = price;
		System.out.println(vc.vaccineId +", "+ vc.price);
		
		Vaccine vacn = new CoviShield();
		vacn.vaccineId = vaccineId;
		vacn.price = price;
		System.out.println(vacn.vaccineId +", "+ vacn.price);
		
		Vaccine.treatsCovid();
		
	}

}