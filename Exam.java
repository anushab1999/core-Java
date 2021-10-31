class Exam{
	
  int fees;
  HallTicket hallTicket;
  
  public Exam(){
		
	}
  
  public Exam(int fees){
  this.fees = fees;
  }
  
  public void allow(HallTicket hallTicket){
	  System.out.println("inside allow");
  if(fees >= 1200){
     if(hallTicket != null){
	    this.hallTicket = hallTicket;
		hallTicket.displayDetails();
		System.out.println("allowed to write the exam");
	 }
	 else{
		 System.out.println("no hallTicket found");
	 }
  }
  else{
	 System.out.println("pay the fee first");
    }
  }  
}