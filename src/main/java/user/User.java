package user;

public class User extends Client{

	private int userType;
	private String paymentOption;
	private Boolean isValid;
	
	public User(String username, String password, int userType, Boolean isValid) {
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.isValid = isValid;
		isManager = false;
		isValid = false;
	}
	
	public int getType() {
		return userType;
	}
	
	public Boolean getValidation() {
		return isValid;
	}
	
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
	
	// should this be static and accept a user type or just return based on whichever user called it ? - Richard
	
	public int paymentRate() {
		//ToDo
		return 0;
	}
}
