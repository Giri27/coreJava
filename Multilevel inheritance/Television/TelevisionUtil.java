class TelevisionUtil{
	
	public static void main(String a[]){
		
		OldTelevision ot = new OldTelevision(56, 25000.00);
		ot.moreSpace();
		ot.crt();
		System.out.println(ot.tvId +", "+ ot.price);
		
		MidTelevision mt = new MidTelevision(678, 40000.00);
		mt.lcd();
		System.out.println(mt.tvId +", "+ mt.price);
		
		NewTelevision nt = new NewTelevision(8709, 87000.00);
		nt.led();
		System.out.println(ot.tvId +", "+ ot.price);
		
		
		
	}

}