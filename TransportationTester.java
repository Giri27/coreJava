class TransportationTester{
	
	public static void main(String a[]){
		
		Transportation tran = new Transportation();
		tran.modeOfTransportation = "Roadways";
		tran.isSafe = false;
		tran.affordable = "yes";
		System.out.println(tran.modeOfTransportation+", "+tran.isSafe+", "+tran.affordable);
		
		Transportation tr = new Transportation();
		tr.modeOfTransportation = "Railways";
		tr.isSafe = false;
		tr.affordable = "yes";
		System.out.println(tr.modeOfTransportation+", "+tr.isSafe+", "+tr.affordable);
		
		Transportation trans = new Transportation();
		trans.modeOfTransportation = "Waterways";
		trans.isSafe = true;
		trans.affordable = "yes";
		System.out.println(trans.modeOfTransportation+", "+trans.isSafe+", "+trans.affordable);
		
		Transportation transpt = new Transportation();
		transpt.modeOfTransportation = "Airways";
		transpt.isSafe = true;
		transpt.affordable = "No";
		System.out.println(transpt.modeOfTransportation+", "+transpt.isSafe+", "+transpt.affordable);
		
		Transportation.travel();
		Transportation.transportGoods();
		
	}

}