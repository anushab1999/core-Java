class SeethaBank extends BandhanBank1{

 public SeethaBank(){
 System.out.println("SeethaBank object is created");
 }
 
 public void rateOfIntrest(String rate2){
  System.out.println("Rate of intrest in Seetha bank: " +rate2);
}

public void state(String state){
	System.out.println("Seetha bank is present in: " +state);
}

public void name(String candidateName){
	  System.out.println("Candidate Name in SeethaBank: " +candidateName);
  }
}