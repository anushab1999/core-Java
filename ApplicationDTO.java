public class ApplicationDTO{
	
	int appId;
	String appName;
	String appType;
	int appSize;
	
	public void setAppId(int appId){
		this.appId = appId;
	}
	public int getAppId(){
		return appId;
	}
	public void setAppName(String appName){
		this.appName = appName;
	}
	public String getAppName(){
		return appName;
	}
	public void setAppType(String appType){
		this.appType = appType;
	}
	public String getAppType(){
		return appType;
	}
	public void setAppSize(int appSize){
		this.appSize = appSize;
	}
	public int getAppSize(){
		return appSize;
	}
}