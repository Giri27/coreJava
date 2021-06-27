class MuseumTester{
	
	public static void main(String a[]){
		
		Museum museum = new Museum("Visvesvaraya Industrial and Technological Museum", 43000, "Science");
		museum.getMuseumDetails();
		
		Museum musm = new Museum("HAL Aerospace Museum", 82000, "Aviation");
		musm.getMuseumDetails();
		
		Museum mus = new Museum("Kempegowda Museum", 35000, "Heritage center");
		mus.getMuseumDetails();
		
		Museum mm = new Museum("Indian Music Experience", 50000, "Music");
		mm.getMuseumDetails();
		
		Museum.exhibhition();
		
	}

}