package user;

public class User extends Client{

	private int userType;
	private String paymentOption;
	private Boolean isValid;
	
	public User(String username, String password, int userType) {
		this.username = username;
		this.password = password;
		this.userType = userType;
		isManager = false;
		isValid = false;
	}
	
	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
	public void validateUser() {
		isValid = true;
	}
	
	// should this be static and accept a user type or just return based on whichever user called it ? - Richard
	
	public int paymentRate() {
		//ToDo
		return 0;
	}
}
