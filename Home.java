class Home{
	
	FurnitureDTO[] furniture;
	int index;
	
	public Home(int size){
		furniture = new FurnitureDTO[size];
	}
	
	public boolean addFurniture(FurnitureDTO furniture){
		boolean isAdded = false;
		System.out.println("Inside addFurniture()");
		if(furniture != null){
			System.out.println("Adding Furniture");
			this.furniture[index++] = furniture;
			isAdded = true;
		}
		else{
			System.out.println("Cannot add Furnature");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i = 0; i < furniture.length; i++){
			if(furniture[i] != null){
				System.out.println(furniture[i].getFurnitureId()+", "+ furniture[i].getFurnitureName()+ ", "+furniture[i].getNumberOfFurniture()+ ", "+furniture[i].getFurnitureColor());
			}
		}
	}
	
	public boolean updateColorById(int id, String color){
		System.out.println("Inside updateColorById()");
		boolean isUpdate = false;
		for(int i = 0; i< furniture.length; i++){
			if(furniture[i] != null){
				if(furniture[i].getFurnitureId() == id){
					furniture[i].setFurnitureColor(color);
					isUpdate = true;
				}
			}
		}
		return isUpdate;
	}
	
	public boolean deleteById(int id){
		System.out.println("Inside deleteById()");
		boolean isDeleted = false;
		for(int i = 0; i< furniture.length; i++){
			if(furniture[i] != null){
				if(furniture[i].getFurnitureId() == id){
					furniture[i] = null;
					isDeleted =  true;
				}
			}
		}
		return isDeleted;
	}

	public FurnitureDTO getFurnitureColorByName(String name) {
		System.out.println("Inside getFurnitureColorByName()");
		FurnitureDTO dto = null;
		for (int i = 0; i < furniture.length; i++) {
			if(name != null){
				if(furniture[i].getFurnitureName().equals(name)){
					dto = furniture[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
}