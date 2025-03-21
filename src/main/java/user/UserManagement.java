package user;

import java.util.ArrayList;

public class UserManagement {

	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Manager> managers = new ArrayList<Manager>();
	
	protected Client authenticate(String username, String password) {
		// If credentials are valid the account does not exist -  Arthur
		if(checkCredentials(username, password)) return null;
		
		// Remaining Implementation
		// ToDo
		return null;
	}
	/**
	 * 
	 * @param username
	 * @param password
	 * @return If username exists on database, and if password is strong enough
	 */
	protected Boolean checkCredentials(String username, String password) {
		//ToDo  - Need DB access - Arthur
		return null;
	}
	
	public ArrayList<Manager> viewManagers(){
		return managers;
	}
	
	public Manager createManager() {
		//ToDo  - Need DB access - Arthur
		return null;
	}
	
	public void deleteManager(String username) {
		Manager toDeleteManager = managers.stream()
										  .filter(manager -> manager.getUsername().equals(username))
									      .findFirst()
									      .orElse(null);
		
		// Manager does not exists, thrown an error ? - Arthur
		if(toDeleteManager == null) return;
		managers.remove(toDeleteManager);
		
		// Remove manager from DB
		// ToDo
	}
	
	public ArrayList<User> viewUsers(){
		return users;
	}
	
	public User createUser(String username, String password, int userType) {
		Client client = authenticate(username, password);
		
		// Maybe throw an error here? - Arthur
		// If account exists can't create a new one with same credentials
		if(client != null) return null;	
		
		// Maybe also throw an error here ? - Arthur
		// If credentials aren't valid can't create account
		if(!checkCredentials(username, password)) return null;
		
		// Else Create new user
		User newUser = new User(username, password, userType);
		
		// Add newUser to database
		// ToDo
		
		return newUser;
	}
	
	public void deleteUser(String username) {
		User toDeleteUser = users.stream()
								 .filter(user -> user.getUsername().equals(username))
								 .findFirst()
								 .orElse(null);

		// User does not exists, thrown an error ? - Arthur
		if(toDeleteUser == null) return;
		users.remove(toDeleteUser);
		
		// Remove user from DB
		// ToD
	}
}
