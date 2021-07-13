class ExerciseUtil{
	
	public static void main(String a[]){
		
		Object obj = new Exercise();
		
		Exercise ex = new Yoga();
		System.out.println(ex.improvesHealth());
		Yoga yoga = (Yoga)ex;
		boolean type = obj.equals(yoga);
		System.out.println(type);
		
		System.out.println(ex.improvesHealth());
		System.out.println(yoga.improvesHealth());
		
	}
	
}