class InkPotUtil{

 public static void main(String args[]){
 
 InkPotDTO dto = new InkPotDTO();
 dto.setInkColor("Blue");
 dto.setBrand("Parker");
 dto.setPackageInformation("Bottle");
 dto.setItemVolume("30 Millilitres");
 
 System.out.println(dto.getInkColor() +" "+ dto.getBrand() +" "+ dto.getPackageInformation() +" "+ dto.getItemVolume());
 
 }



}