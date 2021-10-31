class ExamUtil{

 public static void main(String args[]){
   Exam exam = new Exam(120);
 
   HallTicket hallTicket = new HallTicket("anu" , "1da17ei006" , "EI"); 
   exam.allow(hallTicket);
 }



}