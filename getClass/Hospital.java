class Hospital{
	
	private String name;
	private PatientDTO[] patients;
	private int index;
	
	public Hospital(int size){
		patients = new PatientDTO[size];
		System.out.println(this.getClass().getSimpleName() + "object is created");
	}
	
	public void savePatients(PatientDTO patients){
		if(patients != null){
			System.out.println("Adding patient details");
			this.patients[index] = patients;
			index++;
		}else{
			System.out.println("Patient details are empty.. please add the details");
		}
		
	}
	
	public void getPatients(){
		for(PatientDTO pdto : patients){
		if(pdto != null){
			System.out.println(pdto.getPatientId() +", "+ pdto.getName() +", "+ pdto.getAge() +", "+ pdto.getMobileNo());
		}else{
			System.out.println("No patient found");
		}
		}
	}
	
	public boolean updatePatientsMobileNoByPatientId(long mobileNo, String patientId){
		System.out.println("invoked update by patientId()");
		boolean updatedMobileNo = false;
		for(int i=0; i<patients.length; i++){
			if(patients[i] != null){
				if(patientId.equals(patients[i].getPatientId())){
					patients[i].setMobileNo(mobileNo);
					updatedMobileNo = true;
				}
				System.out.println();
			}
		}
		return updatedMobileNo;
	}
	
	public boolean deletePatientById(String patientId){
		System.out.println("invoked delete by patientId()");
		boolean deleted = false;
		for(int i=0; i<patients.length; i++){
			if(patients[i] != null){
				if(patientId.equals(patients[i].getPatientId())){
					patients[i] = null;
					deleted = true;
				}
			}
		}
		return deleted;
	}
	
	public void getPatientDetailsByName(String name){
		System.out.println("invoked patient details by patient name()");
		
		for(int i=0; i<patients.length; i++){
			if(patients[i] != null){
				if(name.equals(patients[i].getName())){
					System.out.println(patients[i].getPatientId() +", "+ patients[i].getName() +", "+ patients[i].getAddress() +", "+ patients[i].getAge() +", "+ patients[i].getMobileNo() );
				}else{
					System.out.println("No patient found");
				}
			}
		}
	}
		
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setIndex(int index){
		this.index = index;
	}
	public int getIndex(){
		return index;
	}

}