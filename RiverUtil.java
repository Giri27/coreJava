class RiverUtil{
	
	public static void main(String a[]){
		
		River rir = new River();
		rir.name="Kaveri";
		rir.lengthInKm = 805;
		rir.origin = "Kodagu";
		rir.source = "TalaKaveri";
		
		rir.produceElectricity();
		
		System.out.println(rir.name);
		System.out.println(rir.hashCode());
		
		River rir1 = new River();
		rir1.name="Kaveri";
		rir1.lengthInKm = 805;
		rir1.origin = "DevPrayag";
		rir1.source = "Alaknanda";
		
		rir1.produceElectricity();
		
		System.out.println(rir1.name);
		System.out.println(rir1.hashCode());
		
		
		
		/*River river = new Kaveri();
		Kaveri kaveri = (Kaveri)river;
		kaveri.displayDetails();
		System.out.println(river.produceElectricity());
		
		River river1 = new Kaveri();
		Kaveri kaveri1 = (Kaveri)river1;
		kaveri1.displayDetails();
		System.out.println(river1.produceElectricity());*/
		
		boolean type = rir.equals(rir1);
		System.out.println(type);
	}
	
}