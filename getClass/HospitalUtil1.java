import java.util.Scanner;
class HospitalUtil1{
	
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
		AddressDTO address = new AddressDTO();
		
		CountryDTO country = new CountryDTO();
		country.setCountryName("India");
			StateDTO state = new StateDTO();
			state.setStateName("Karnataka");
				CityDTO city = new CityDTO();
				city.setCityName("Bangalore");
					AreaDTO area = new AreaDTO();
					area.setAreaName("Jp nagar");
						StreetDTO street = new StreetDTO();
						street.setStreetName("Jeewan Griha");
						street.streetNo[] = {87, 99};
						street.setStreetNo(streetNo);
						 
		area.setStreets(streets);
		AreaDTO areas[] = {area};
			city.setAreas(areas);
			CityDTO cities[] = {city};
			state.setCities(cities);
			StateDTO states[] = {state};
				country.setStates(states);
				address.setCountries(country);
				dto.setAddress(address);
		
		hosp.savePatients(dto);
		hosp.getPatients();
		
				
	}

	
}