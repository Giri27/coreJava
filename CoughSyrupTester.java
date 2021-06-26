class CoughSyrupTester{
	
	public static void main(String a[]){
		
		CoughSyrup cs = new CoughSyrup("Kofarest", 113, true);
		cs.getSyrupDetails();
		
		CoughSyrup coughs = new CoughSyrup("Cofsils", 82, true);
		coughs.getSyrupDetails();
		
		CoughSyrup csyrup = new CoughSyrup("Benadryl", 118, false);
		csyrup.getSyrupDetails();
		
		CoughSyrup csp = new CoughSyrup("Vicks Cough Syrup", 93, false);
		csp.getSyrupDetails();
		
		CoughSyrup.reliefFromCough();
		
		
	}

}