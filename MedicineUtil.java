class MedicineUtil{
	
	static{
		System.out.println("Executing medicine util");
	}
	
	public static void main(String a[]){
		
		Medicine medicine = new Medicine();
		{
			System.out .println("Main method started");
			medicine.curesDisease();
			System.out .println("Main method ended");
		}
		
	}
}