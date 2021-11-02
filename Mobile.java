class Mobile{
	
	ApplicationDTO[] application;
	int index;
	
	public Mobile(int size){
		application = new ApplicationDTO[size];
	}
	
	public boolean addApplication(ApplicationDTO application){
		boolean isAdded = false;
		System.out.println("Inside addApplication()");
		if(application != null){
			System.out.println("Adding Application");
			this.application[index++]= application;
			isAdded = true;
		}
		else{
			System.out.println("Cannot Add Application");
		}
		return isAdded;
	}
	public void printDetails(){
		for(int i =  0;  i< application.length; i++){
			if(application[i] != null){
				System.out.println(application[i].getAppId()+ ",  "+application[i].getAppName()+ ",  "+application[i].getAppType()+ ",  "+application[i].getAppSize());
			}
			
		}
	}
	
	public boolean updateAppNameByAppId(int id, String name){
		System.out.println("Inside updateAppNameByAppId()");
		boolean isUpdated = false;
		for(int i = 0; i <application.length; i++){
			if(application[i] != null){
				if(application[i].getAppId() == id){
					application[i].setAppName(name);
					isUpdated = true;
				}
			}
		}
		return isUpdated;
	}
	
	public boolean deleteByAppId(int id){
		System.out.println("Inside deleteByAppId()");
		boolean isDeleted = false;
		for(int i = 0; i< application.length; i++){
			if(application[i] != null){
				if(application[i].getAppId() == id){
					application[i] = null;
					isDeleted = true;
				}
			}
		}
		return isDeleted;
	}
	public ApplicationDTO getAppNameByAppType(String type) {
		System.out.println("Inside getOsNameByOsSize()");
		ApplicationDTO dto = null;
		for (int i = 0; i < application.length; i++) {
			if(type != null){
				if(application[i].getAppType().equals(type)){
					dto = application[i];
				}else{
					System.out.println("Not found");
				}
			}
		}
		return dto;
	}
}