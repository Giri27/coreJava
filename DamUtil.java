class DamUtil{
	
	public static void main(String a[]){
		
		Object obj = new Dam();
		
		Dam dam = new KRS();
		boolean type = obj.equals(dam);
		System.out.println(type);		
		
		KRS krs = (KRS)dam;
		krs.displayDetails();		
		System.out.println(dam.activeCapacityInCubicMetre());
		
	}
	
}