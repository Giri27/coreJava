class KRS extends Dam{
	
	public int lengthInMetre = 2620;
	
	public KRS(){
		System.out.println("KRS object is created");
	}
	
	@Override
	public Number activeCapacityInCubicMetre(){
		return 1412980000;
	}
	
	public void displayDetails(){
		System.out.println(super.location);
		System.out.println(super.heightInMetre);
		System.out.println(super.surfaceArea);
		System.out.println(this.lengthInMetre);
	}
}