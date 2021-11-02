public class RoomsDTO{
	int roomNo;
	String roomType;
	int numberOfBed;
	
	
	public void setRoomNumber(int roomNo){
		this.roomNo =  roomNo;
	}
	public int getRoomNumber(){
		return roomNo;
	}
	public void setRoomType(String roomType){
		this.roomType = roomType;
	}
	public String getRoomType(){
		return roomType;
	}
	
	public void setNumberOfBed(int numberOfBed){
		this.numberOfBed = numberOfBed;
	}
	public int getNumberOfBed(){
		return numberOfBed;
	} 

}