class PatientDTO{
	
	private String patientId;;
	private String name;
	private String[] address;
	private long mobileNo;
	private int age;
	
	public PatientDTO(){
		
		System.out.println("PatientDTO object is created");
		System.out.println(this.getClass().getSimpleName()+"object is created");
		
	}
	
	public void setPatientId(String patientId){
		this.patientId = patientId;
	}
	public String getPatientId(){
		return patientId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAddress(String[] address){
		this.address = address;
	}
	public String[] getAddress(){
		return address;
	}
	
	public void setMobileNo(long mobileNo){
		this.mobileNo = mobileNo;
	}
	public long getMobileNo(){
		return mobileNo;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}