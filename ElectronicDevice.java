class ElectronicDevice{

 public String connectorType;
 public String supportedServices;
 public String[] displayTechnology;
 
 public void setConnectorType(String connectorType){
 this.connectorType = connectorType;
 }
 
 public void setSupportedServices(String supportedServices){
 this.supportedServices = supportedServices;
 }
 public String[] getSupportedServices(){
	 return supportedServices;
 }
 
 public void setDisplayTechnology(String[] displayTechnology){
 this.displayTechnology = displayTechnology;
 }

}