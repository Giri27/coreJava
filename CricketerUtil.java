class CricketerUtil{
	
	public static void main(String a[]){
		
		//Object obj = new Cricketer();
		
		Cricketer ckt = new MsDhoni();
		
		boolean type = ckt.equals(ckt);
		System.out.println(type);
		
		MsDhoni msd = (MsDhoni)ckt;
		msd.displayDetails();
	}
}