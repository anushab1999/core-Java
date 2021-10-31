class BandhanBank extends Bank{

  public BandhanBank(double rate){
  this.rate = rate;
  }
  
  public void rateOfIntrest(Account account){
  super.rateOfIntrest(account);
  }

}