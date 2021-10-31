class HeadPhonesDTO {

 private String headPhoneType;
 private String color;
 private double price;
 private String connectivityType;
 private boolean microphone;
 
 public HeadPhonesDTO(){
 System.out.println("HeadPhonesDTO object is created");
 }
 
 public void setHeadPhoneType(String headPhoneType){
 this.headPhoneType = headPhoneType;
 }
 public String getHeadPhoneType(){
 return headPhoneType;
 }
 
 public void setColor(String color){
 this.color = color;
 }
 public String getColor(){
 return color;
 }
 
 public void setPrice(double price){
 this.price = price;
 }
 public double getPrice(){
 return price;
 }
 
 public void setConnectivityType(String connectivityType){
 this.connectivityType = connectivityType;
 }
 public String getConnectivityType(){
 return connectivityType;
 }
 
 public void setMicrophone(boolean microphone){
 this.microphone = microphone;
 }
 public boolean getMicrophone(){
 return microphone;
 }
 
 
 
 
 
 
 
 
}
