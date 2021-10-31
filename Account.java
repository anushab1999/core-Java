class Account{

   String name;
   long accountNo;
   
   public Account(String name , long accountNo){
   this.name = name;
   this.accountNo = accountNo;
   }
   
   public void displayDetails(){
   System.out.println("Name: " +this.name);
   System.out.println("Account number: " +this.accountNo);
   }
   

}