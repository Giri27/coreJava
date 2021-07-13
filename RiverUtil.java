class RiverUtil{
	
	public static void main(String a[]){
		
		River river = new Kaveri();
		Kaveri kaveri = (Kaveri)river;
		boolean type = river.equals(kaveri);
		System.out.println(type);
		
		kaveri.displayDetails();
		System.out.println(river.produceElectricity());
				
	}
	
}