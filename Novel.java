class Novel{
	
	String name;
	String author;
	String type;
	String noOfCopies;
	
	public Novel(){
		this("Harry Potter", "J K Rowling", "Mystery");
		System.out.println("Constructor with no parameter");
		System.out.println(this.name+", "+this.author+", "+this.type+", "+this.noOfCopies);
		System.out.println("Ending constructor with no parameter");
	}
	
	public Novel(String name, String author, String type){
		this("500 million");
		System.out.println("Constructor with Three parameters");
		this.name = name;
		this.author = author;
		this.type = type;
		System.out.println("Ending constructor with three parameters");
	}
	
	public Novel(String noOfCopies){
		
		System.out.println("Constructor with one parameter");
		this.noOfCopies = noOfCopies;
		System.out.println("Ending constructor with one parameter");
	}
	
	public static void reading(){
		
		System.out.println("reading");
	}

}