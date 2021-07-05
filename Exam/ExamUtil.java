class ExamUtil{
	
	public static void main(String a[]){
		
		Exam exam = new Exam();
		exam.code = "21CS11";
		exam.fees = 900;
		
		HallTicket hallTicket = null;
		
		boolean allowed = exam.allow(hallTicket);
		if(allowed){
			System.out.println("Can write exams");
		}else{
			System.out.println("Cannot write exams");
		}
			
		SupplementaryExams sExams = new SupplementaryExams();
		boolean allowedForSupplementary = sExams.allow(hallTicket);
		if(allowedForSupplementary){
			System.out.println("Can write supplementary exams");
		}else{
			System.out.println("Cannot write supplementary exams");
		}
	}
}