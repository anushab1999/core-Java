class CupUtil{

 public static void main(String args[]){
 
 CupDTO dto = new CupDTO();
 dto.setCupId(14);
 dto.setItemWeight("1 kg 500 g");
 dto.setItemDimensionLxWxH("11 x 7 x 6 Centimeters");
 dto.setPrice(1599.00);
 
 System.out.println(dto.getCupId() +" "+ dto.getItemWeight() +" "+ dto.getItemDimensionLxWxH() +" "+ dto.getPrice());
 
 System.out.println(dto.hashCode());
 System.out.println(dto);
 }
 

}