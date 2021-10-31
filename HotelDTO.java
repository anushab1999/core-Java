class HotelDTO{

public HotelDTO(){
System.out.println("HotelDTO object is created");
}

private int hotelId;
private String name;
private String address;
private String[] menuItems;

public void setHotelId(int hotelId){
this.hotelId = hotelId;
}
public int getHotelId(){
return hotelId;
}

public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}

public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return address;
}

public void setMenuItems(String[] menuItems){
this.menuItems = menuItems;
}
public String[] getMenuItems(){
return menuItems;
}


}