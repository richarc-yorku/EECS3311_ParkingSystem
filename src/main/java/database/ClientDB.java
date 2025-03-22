package database;

import java.util.ArrayList;

import user.Client;
import user.Manager;
import user.User;

public class ClientDB {

	protected static ArrayList<User> users = new ArrayList<>();
	protected static ArrayList<Manager> managers = new ArrayList<>();
	
	public static Client authenticate(String username, String password) {
		// todo: this should check if these credentials match a user and return the user
		return null;
	}
	
	protected static Boolean checkCredentials(String username, String password) {		
		// Checking username availability
		
		boolean userNameExists = users.stream().anyMatch(user -> user.getUsername().equals(username));
		if(userNameExists) return false;
		
		userNameExists = managers.stream().anyMatch(manager -> manager.getUsername().equals(username));
		if(userNameExists) return false;
		
		/* Checking Password Strength */
		// If we want to we could throw an error at each check condition to dynamically tell the user what conditions they're not meeting - Arthur
		
		if(password.length() < 8) return false;
		if(!password.chars().anyMatch(Character::isLowerCase)) return false;
		if(!password.chars().anyMatch(Character::isUpperCase)) return false;
		if(!password.chars().anyMatch(Character::isDigit)) return false;
		// Check if password has symbols
		if(!password.chars().anyMatch(c -> !Character.isLetterOrDigit(c))) return false;
		
		return true;
	}
	
	public static boolean createUser(String username, String password, int userType, Boolean isValid) {
		if (checkCredentials(username, password)) {
			User newUser = new User(username, password, userType, isValid);
			users.add(newUser);
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean createManager(String username, String password) {
		if (checkCredentials(username, password)) {
			Manager newManager = new Manager(username, password);
			managers.add(newManager);
			return true;
		} else {
			return false;
		}
	}
	
	// deletion should check that the user submitting these commands is manager etc.
	
	public static boolean deleteUser(String username) {
		User toDeleteUser = users.stream()
								 .filter(user -> user.getUsername().equals(username))
								 .findFirst()
								 .orElse(null);

		if(toDeleteUser == null) return false;
		users.remove(toDeleteUser);
		return true;
	}
	
	public static boolean deleteManager(String username) {
		Manager toDeleteManager = managers.stream()
										  .filter(manager -> manager.getUsername().equals(username))
									      .findFirst()
									      .orElse(null);
		
		if(toDeleteManager == null) return false;
		managers.remove(toDeleteManager);
		return true;
	}
	
	public static ArrayList<User> viewUsers(){
		return users;
	}
	
	public static ArrayList<Manager> viewManagers(){
		return managers;
	}
}
