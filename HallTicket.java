class HallTicket{

  String name;
  String USN;
  String branch;
  
  public HallTicket(String name ,String USN , String branch){
  this.name = name;
  this.USN = USN;
  this.branch = branch;
  }
  
  public void displayDetails(){
  System.out.println("Name: " +this.name);
  System.out.println("USN no: " +this.USN);
  System.out.println("Branch: " +this.branch);
  }


}