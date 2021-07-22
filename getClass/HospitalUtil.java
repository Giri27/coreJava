import java.util.Scanner;
class HospitalUtil{
	
	public static void main(String a[]){ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		Hospital hosp = new Hospital(size);
		
		PatientDTO dto = new PatientDTO();
		dto.setName("Hemanth");
		dto.setPatientId("1");
		dto.setAge(40);
		dto.setMobileNo(9898786543L);
		String addressDetails[] = {"HampiNagar, Bangalore-560040", "Hubli-560038"};
		dto.setAddress(addressDetails);
		
		PatientDTO dto1 = new PatientDTO();
		dto1.setName("Kishan");
		dto1.setPatientId("2");
		dto1.setAge(45);
		dto1.setMobileNo(7789786543L);
		String addressDetails1[] = {"VijayaNagar, Bangalore-560040", "Hubli-560038"};
		dto1.setAddress(addressDetails1);
		
		hosp.savePatients(dto);
		hosp.savePatients(dto1);
		
		hosp.getPatients();
		hosp.updatePatientsMobileNoByPatientId(8976587655L, "2");
		hosp.getPatients();
		hosp.deletePatientById("2");
		hosp.getPatients();
		
		
		
	}

	
}