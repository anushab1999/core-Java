class RouterUtil{

 public static void main(String args[]){
 
 RouterDTO dto = new RouterDTO();
 dto.setRouterID(1);
 dto.setName("D-link");
 dto.setColor("balck&white");
 dto.setPrice(900.00);
 
 System.out.println(dto.getRouterID() +" "+ dto.getName() +" "+ dto.getColor() +" "+ dto.getPrice());
 
 
 }



}