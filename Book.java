class Book{
	
	public static void books(){
		
		System.out.println("A book is a bank of knowledge");
		
	}
	
	public static void books(String noteBook){
		
		noteBook = "Notebooks are used for writing";
		System.out.println(noteBook);
		
	}
	
	public static void books(int noOfNoteBook){
		
		System.out.println("I use "+noOfNoteBook+" number of books monthly for writing");
		
	}
	
	public static void main(String a[]){
		
		books();
		books("noteBook");
		books(4);
		
	}

}