package user;

import java.util.ArrayList;

public class UserManagement {

	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Manager> managers = new ArrayList<Manager>();
	
	public Client authenticate(String username, String password) {
		//ToDo
		return null;
	}
	
	public Boolean checkCredentials(String username, String password) {
		//ToDo
		return null;
	}
	
	public ArrayList<Manager> viewManagers(){
		return managers;
	}
	
	public void addManager() {
		//ToDo
	}
	
	public void deleteManager() {
		//ToDo
	}
	
	public ArrayList<User> viewUsers(){
		return users;
	}
	
	public void addUser(String username, String password, int userType) {
		//ToDo
	}
	
	public void deleteUser(String username) {
		//ToDo
	}
}
