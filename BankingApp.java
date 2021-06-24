class BankingApp{
	
	String bankName;
	String accountTypes;
	String appName;
	boolean isInternetBankingAvailable;
	boolean isCustomerServiceOptionAvailable;
	
	public static void main(String a[]){
		
		BankingApp ba = new BankingApp();
		ba.bankName = "ICICI Bank";
		ba.accountTypes = "Savings&Current";
		ba.appName = "iMobile";
		ba.isInternetBankingAvailable = true;
		ba.isCustomerServiceOptionAvailable = true;
		System.out.println(ba.bankName+", "+ba.accountTypes+", "+ba.appName+", "+ba.isInternetBankingAvailable+", "+ba.isCustomerServiceOptionAvailable);
		
		BankingApp bank = new BankingApp();
		bank.bankName = "Union Bank";
		bank.accountTypes = "Savings";
		bank.appName = "U-Mobile";
		bank.isInternetBankingAvailable = true;
		bank.isCustomerServiceOptionAvailable = false;
		System.out.println(bank.bankName+", "+bank.accountTypes+", "+bank.appName+", "+bank.isInternetBankingAvailable+", "+bank.isCustomerServiceOptionAvailable);
		
		BankingApp bapp = new BankingApp();
		bapp.bankName = "Canara Bank";
		bapp.accountTypes = "Savings";
		bapp.appName = "CANDI";
		bapp.isInternetBankingAvailable = true;
		bapp.isCustomerServiceOptionAvailable = false;
		System.out.println(bapp.bankName+", "+bapp.accountTypes+", "+bapp.appName+", "+bapp.isInternetBankingAvailable+", "+bapp.isCustomerServiceOptionAvailable);
	
		BankingApp bankapp = new BankingApp();
		bankapp.bankName = "Axis Bank";
		bankapp.accountTypes = "Savings&Current";
		bankapp.appName = "Axis Mobile";
		bankapp.isInternetBankingAvailable = true;
		bankapp.isCustomerServiceOptionAvailable = true;
		System.out.println(bankapp.bankName+", "+bankapp.accountTypes+", "+bankapp.appName+", "+bankapp.isInternetBankingAvailable+", "+bankapp.isCustomerServiceOptionAvailable);
	}

}