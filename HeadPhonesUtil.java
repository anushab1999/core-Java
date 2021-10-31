class HeadPhonesUtil{

 public static void main(String args[]){
 
 HeadPhonesDTO h1 = new HeadPhonesDTO();
 h1.setHeadPhoneType("overear");
 h1.setColor("lightBlue");
 h1.setPrice(1099.00);
 h1.setConnectivityType("wireless");
 h1.setMicrophone(false);
 
 System.out.println(h1.getHeadPhoneType() +" "+ h1.getColor() +" "+ h1.getPrice() +" "+ h1.getConnectivityType() +" microphone :"+ h1.getMicrophone());

 }
}