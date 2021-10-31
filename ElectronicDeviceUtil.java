class ElectronicDeviceUtil{

  static String[] supportedServices = {"netflix" , "prime video" , "youTube"};

 public static void main(String args[]){
 
 TV t1 = new TV();
 t1.setConnectorType("wi-fi");
 t1.setSupportedServices(supportedServices);
 t1.setDisplayTechnology("LED");
 t1.TvDetails();
 }

  String[] services = t1.getSupportedServices();
  for(int i=0; i<services.length; i++){
  System.out.println(services[i]);
  }



}