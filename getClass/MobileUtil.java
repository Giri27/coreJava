import java.util.Scanner;
class MobileUtil{
	
	public static void main(String a[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		Mobile mobile = new Mobile(size);
		
		for(int i=0; i<size; i++){
			
			System.out.println("Enter the id");
			int appsId = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the type");
			String type = sc.next();
			System.out.println("Enter the size of app");
			String sizeInMb = sc.next();
			System.out.println("Is internet required");
			String internetRequired = sc.next();
		
			AppsDTO dto = new AppsDTO();
			dto.setAppsId(appsId);
			dto.setName(name);
			dto.setType(type);
			dto.setSizeInMb(sizeInMb);
			dto.isInternetRequired(Boolean.parseBoolean(internetRequired));
			//mobile.createApps(dto);
			//System.out.println(mobile.createApps(dto));
		}
		/*AppsDTO dto1 = new AppsDTO();
		dto1.setAppsId(2);
		dto1.setName("Instagram");
		dto1.setType("Social-Media");
		dto1.setSizeInMb("50mb");
		dto1.isInternetRequired(true);
		System.out.println(mobile.createApps(dto1));
		mobile.createApps(dto1);*/
		
		mobile.getApps();
		
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the size of app");
		String sizeInMb = sc.next();
		System.out.println();
		System.out.println(mobile.updateAppSizeByName("70mb", "Flipkart"));
		
		mobile.getApps();
	}

}