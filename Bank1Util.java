class Bank1Util{

  public static void main(String args[]){
  
  /*Bank1 bnk = new Bank1();            //PARENT CLASS OBJECT
  bnk.rateOfIntrest("7%");*/
 
   /* Bank1 bnk = new BandhanBank1();             //POLYMORPHISM
	bnk.rateOfIntrest("6%");
	bnk.name("Anu");*/
     
     /*BandhanBank1 bnk = new BandhanBank1();        //CHILD CLASS OBJECT
     bnk.rateOfIntrest("6%");	 
     bnk.name("Anu");*/
	 
	  /*BandhanBank1 bnk = new SeethaBank();
	  bnk.rateOfIntrest("5%");
	  bnk.name("Anu");*/
	  
	   /*SeethaBank bnk = new SeethaBank();
	   bnk.rateOfIntrest("5%");
	   bnk.name("anu");
	   bnk.state("karnataka");
	   bnk.name("Anusha");*/
	   
	   /*DhanalakshmiBank1 bnk = new DhanalakshmiBank1();
	   bnk.rateOfIntrest("2%");
	   bnk.accountNumber(12345L);
	   bnk.state("karnataka");
	   bnk.name("Anushab");*/
	   
	   SeethaBank bnk = new DhanalakshmiBank1();
	   bnk.rateOfIntrest("2%");
	   bnk.state("karnataka");
	   bnk.name("Anushab");
	   
	   
	     /*DhanalakshmiBank1 bnk = new DenaBank();
		 bnk.rateOfIntrest("10%");
		 bnk.name("Anu");
		 bnk.state("karnataka");
		 bnk.accountNumber(12345L);*/
		 
		 /*DenaBank bnk = new DenaBank();
		 bnk.rateOfIntrest("10%");
		 bnk.accountNumber(12345L);
		 bnk.ifscNumber(123456789L);
		 bnk.name("Anu");
		 bnk.state("karnataka");*/
  }
}