class Bank{
	
	public static void bankAcc(){
		
		System.out.println("Successfully created account");
	}
	
	public static String bankAcc(String deposit){
		
		deposit = "Amount deposited";
		return deposit;
	}
	
	public static void bankAcc(int amount, String withdraw){
		
		withdraw = ""+amount+" is withdrawn";
		System.out.println(withdraw);
		
	}
	
	public static void main(String a[]){
		
		bankAcc();
		bankAcc("deposit");
		System.out.println("Bank account successfully created " +Bank.bankAcc("deposit"));
		bankAcc(10000, "withdraw");
	}

}