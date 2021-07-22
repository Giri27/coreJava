class Hospital1{
	
	private String name;
	private PatientDTO[] patients;
	private int index;
	
	public Hospital1(){
		patients = new PatientDTO[];
		System.out.println(this.getClass().getSimpleName() +" object is created ");
	}
	
	public void savePatients(){
		if(patients != null){
			System.out.println("Adding patient details");
			this.patients[index] = patients;
			index++;
		}else{
			System.out.println("Patients details are empty.. please add the details");
		}
	}
	
	public void getPatients(){
		for(PatientDTO pdto = patients){
			if(pdto != null){
				System.out.println(pdto.getPatientId()+", "+pdto.getName()+", "+pdto.getAge()+", "+pdto.getMobileNo());
			}else{
				System.out.println("No patient found");
			}
		}
	}

}