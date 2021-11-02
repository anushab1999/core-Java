public class FurnitureDTO{
	int furnitureId;
	String furnitureName;
	int numberOfFurniture;
	String furnitureColor;
	
	public void setFurnitureId(int furnitureId){
		this.furnitureId = furnitureId;
	}
	public int getFurnitureId(){
		return furnitureId;
	}
	public void setFurnitureName(String furnitureName){
		this.furnitureName = furnitureName;
	}
	public String getFurnitureName(){
		return furnitureName;
	}
	public void setNumberOfFurniture(int numberOfFurniture){
		this.numberOfFurniture = numberOfFurniture;
	}
	public int getNumberOfFurniture(){
		return numberOfFurniture;
	}
	public void setFurnitureColor(String furnitureColor){
		this.furnitureColor = furnitureColor;
	}
	public String getFurnitureColor(){
		return furnitureColor;
	}
}