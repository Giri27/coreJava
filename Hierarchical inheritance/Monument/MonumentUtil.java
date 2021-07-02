class MonumentUtil{
	
	public static void main(String a[]){
		
		IndiaGate gate = new IndiaGate(34, "New Delhi", 30.6);
		System.out.println(gate.monumentId +", "+ gate.location +", "+ gate.areaInHectares);
		
		GolGumbaz gg = new GolGumbaz(98, "Bijapur", 30);
		System.out.println(gg.monumentId +", "+ gg.location +", "+ gg.areaInHectares);
		
	}

}