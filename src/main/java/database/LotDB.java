package database;

import parking.ParkingLot;
import parking.ParkingSpot;

// ToDo: a few methods

public class LotDB {

	protected static ParkingLot lots[] = new ParkingLot[26];
	
	public static void addLot() {
        // ToDo: assign lot an empty char and generate 100 spots
    }
	
	public static void removeLot() {
        // ToDo
    }
	
	// setting status to false should cancel existing bookings & refund
	// all of the character stuff is to get an offset ie: 'A' - 'A' = 0
	
	public static boolean setLotStatus(char lotID, boolean lotStatus) {
		// make sure input is good and that the lot in question exists
		if (lotID > 'Z' || lotID < 'A' || lots[lotID-'A'] == null) 
			return false;
		
		lots[lotID-'A'].setStatus(lotStatus);
		return true;
    }

	public static boolean setSpotStatus(String spotID, boolean spotStatus) {
		char lotID = spotID.charAt(0);
		int spotNum = Integer.valueOf(spotID.substring(1))-1;
		
		// make sure input is good x2 and that the lot in question exists
		if (lotID > 'Z' || lotID < 'A' || lots[lotID-'A'] == null || spotNum < 1 || spotNum > 100)
			return false;
		
		ParkingSpot spots[] = lots[lotID-'A'].getSpots();
		spots[spotNum].setStatus(spotStatus);
		return true;
    }
}
