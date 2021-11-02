public class AccountDTO{
	int accountId;
	String accountName;
	long phone;
	
	
	public void setAccountId(int accountId){
		this.accountId  = accountId;
	}
	public int getAccountId(){
		return accountId;
	}
	
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}
	public String getAccountName(){
		return accountName;
	}
	
	public void setPhone(long phone){
		this.phone = phone;
	}
	public long getPhone(){
		return phone;
	}
	
}