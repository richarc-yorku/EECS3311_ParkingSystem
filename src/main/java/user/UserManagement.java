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
		// Checking username availability
		
		// Throw an error to show specifically that username is unavailable? - Arthur
		boolean userNameExists = users.stream().anyMatch(user -> user.getUsername().equals(username));
		if(userNameExists) return false;
		
		userNameExists = managers.stream().anyMatch(manager -> manager.getUsername().equals(username));
		if(userNameExists) return false;
		
		/* Checking password existence in database */
		// ToDo
		
		/* Checking Password Strength */
		
		// If we want to we could throw an error at each check condition to dynamically tell the user what conditions they're not meeting - Arthur
		
		// Check password length
		if(password.length() < 8) return false;
		
		// Check if password has lower case characters
		if(!password.chars().anyMatch(Character::isLowerCase)) return false;
		
		// Check if password has upper case characters
		if(!password.chars().anyMatch(Character::isUpperCase)) return false;
		
		// Check if password has numbers
		if(!password.chars().anyMatch(Character::isDigit)) return false;
		
		// Check if password has symbols
		if(!password.chars().anyMatch(c -> !Character.isLetterOrDigit(c))) return false;
		
		return true;
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
		// ToDo
	}
}
