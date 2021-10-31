class SupplimentayExam extends Exam{

  public SupplimentaryExam(int fees){
  this.fees = fees;
  }
  
  public void allow(HallTicket hallTicket){
  super.allow(hallTicket);
  }


}