class SmartPhoneTester{
	
	public static void main(String a[]){
		
		SmartPhone sp = new SmartPhone();
		sp.brand = "OnePlus";
		sp.model = "OnePlus 6t";
		sp.price = 32990f;
		sp.noOfCameras = 2;
		sp.os = "Android";
		System.out.println(sp.brand+", "+sp.model+", "+sp.price+", "+sp.noOfCameras+", "+sp.os);
		
		SmartPhone sphone = new SmartPhone();
		sphone.brand = "MI";
		sphone.model = "MI 10i";
		sphone.price = 23990f;
		sphone.noOfCameras = 4;
		sphone.os = "Android";
		System.out.println(sphone.brand+", "+sphone.model+", "+sphone.price+", "+sphone.noOfCameras+", "+sphone.os);
		
		SmartPhone smartp = new SmartPhone();
		smartp.brand = "iQOO";
		smartp.model = "iQOO Z3";
		smartp.price = 20990f;
		smartp.noOfCameras = 2;
		smartp.os = "Android";
		System.out.println(smartp.brand+", "+smartp.model+", "+smartp.price+", "+smartp.noOfCameras+", "+smartp.os+", "+smartp.os);
		
		SmartPhone smtphone = new SmartPhone();
		smtphone.brand = "Vivo";
		smtphone.model = "Vivo V21";
		smtphone.price = 32990f;
		smtphone.noOfCameras = 3;
		smtphone.os = "Android";
		System.out.println(smtphone.brand+", "+smtphone.model+", "+smtphone.price+", "+smtphone.noOfCameras+", "+smtphone.os);
		
		SmartPhone smartphone = new SmartPhone();
		smartphone.brand = "Apple";
		smartphone.model = "iPhone 12";
		smartphone.price = 72000f;
		smartphone.noOfCameras = 2;
		smartphone.os = "ios";
		System.out.println(smartphone.brand+", "+smartphone.model+", "+smartphone.price+", "+smartphone.noOfCameras+", "+smartphone.os);
		
	}

}