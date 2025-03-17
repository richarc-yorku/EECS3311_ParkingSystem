package parking;

import java.util.ArrayList;
import user.Client;

public class ParkingManagement {
	
	private static ArrayList<ParkingLot> lots = new ArrayList<ParkingLot>();
	
	public static void addLot() {
		//ToDo
	}
	
	public static ArrayList<ParkingLot> getLots(){
		return lots; // should this return a copy?
	}
	
	public static void setLotStatus(int lotID, Boolean lotStatus) {
		//ToDo
	}
	
	public static void setSpotStatus(int lotID, int spotID, Boolean spotStatus) {
		//ToDo
	}
	
	//Client parameter was added to the booking functions to make backend easier to implement - Richard
	
	public static boolean createBooking(Client user, int lotID, int spotID, int startTime, int endTime) {
		//ToDo
		return false;
	}
	
	public static boolean editBooking(Client user, int startTime, int endTime) {
		//ToDo
		return false;
	}
	
	public static boolean extendBooking(Client user, int endTime) {
		//ToDo
		return false;
	}
	
	public static boolean cancelBooking(Client user) {
		//ToDo
		return false;
	}
}
