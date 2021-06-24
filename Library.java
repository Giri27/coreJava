class Library{
	
	String libraryName;
	int numberOfSections;
	String entryTime;
	String exitTime;
	
	public static void main (String a[]){
		
		Library lib = new Library();
		lib.libraryName = "City Central Library";
		lib.numberOfSections = 12;
		lib.entryTime = "8:00am";
		lib.exitTime = "5:00pm";
		System.out.println(lib.libraryName+", "+lib.numberOfSections+", "+lib.entryTime+", "+lib.exitTime);
		
		Library library = new Library();
		library.libraryName = "MyMitra Library";
		library.numberOfSections = 10;
		library.entryTime = "8:30am";
		library.exitTime = "6:00pm";
		System.out.println(library.libraryName+", "+library.numberOfSections+", "+library.entryTime+", "+library.exitTime);
		
		Library libr = new Library();
		libr.libraryName = "Government Library";
		libr.numberOfSections = 15;
		libr.entryTime = "7:30am";
		libr.exitTime = "8:00pm";
		System.out.println(libr.libraryName+", "+libr.numberOfSections+", "+libr.entryTime+", "+libr.exitTime);
		
	}

}