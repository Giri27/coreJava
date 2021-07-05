class SupplementaryExams extends Exam{
	
	public SupplementaryExams(){
		
		System.out.println("Supplementary object created");
	}
	
	public boolean allow(HallTicket hallTicket){
		
		System.out.println("Invoked allow from supplementary exams");
		super.code = "21CS11";
		super.fees = 900;
		return super.allow(hallTicket);
	}

}