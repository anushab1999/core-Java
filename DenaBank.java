class DenaBank extends DhanalakshmiBank1{

   public DenaBank(){
   System.out.println("DenaBank object is created");
   }
   
   public void rateOfIntrest(String rate){
    System.out.println("Rate of intrest in Dena Bank is: " +rate);   
   }
   
   public void ifscNumber(long number){
	  System.out.println("ifsc number: " +number);
  }
  
  public void state(String state){
	 System.out.println("DenaBank is present in: " +state);
  }

}