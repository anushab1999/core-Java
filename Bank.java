class Bank{
	
 double rate;
 Account account;
 
 public Bank(){
		System.out.println("Bank object is created");
	}
 
 public Bank(double rate){
 this.rate = rate;
 }
 
 public void rateOfIntrest(Account account){
 
 if(rate <= 7.0){
	System.out.println("inside Account");
	 if(account != null){
		 this.account = account;
		 account.displayDetails();
		 System.out.println("good bank");
	 }
	 else{
		 System.out.println("bank is not good");
	 }
 }
   else{
	   System.out.println("provide good rate of intrest");
   }
   
 }


}