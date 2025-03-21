package user;

public class Manager extends Client {

	private Boolean isSuper;
	
	private Manager(String username, String password) {
		this.username = username;
		this.password = password;
		isSuper = false;
	}
}
