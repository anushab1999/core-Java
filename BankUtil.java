class BankUtil{

  public static void main(String args[]){
	  
  Bank bank = new BandhanBank(8);
  
  Account account = new Account("anusha" , 87767L);
  bank.rateOfIntrest(account);
  }

}