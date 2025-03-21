package parking;

import java.util.ArrayList;
import user.Client;

public class ParkingManagement {
	
	private static ArrayList<ParkingLot> lots = new ArrayList<ParkingLot>();
	private static HashMap<Client, Booking> bookings = new HashMap<>(); // Could do something like this?
	
	public static void addLot(ParkingLot lot) {
		//ToDo
		lots.add(lot);
	}
	
	public static ArrayList<ParkingLot> getLots(){
		return new ArrayList<>(lots); // returns copy to prevent change
	}
	
	public static void setLotStatus(int lotID, Boolean lotStatus) {
		//ToDo

		for(ParkingLot lot : lots){
			if(lot.getId() == lotID){
				lot.setAvailable(lolStatus);
				break; // can get out of this easier with lotstatusNum and just set it to 1, with it in the for
			}
		}
	}
	
	public static void setSpotStatus(int lotID, int spotID, Boolean spotStatus) {
		//ToDo
	
		for (ParkingLot lot : lots) {
            		if (lot.getId() == lotID) {
                		lot.setSpotAvailability(spotID, spotStatus);
                		break; // same thing as above
            		}
        	}
	}
	
	//Client parameter was added to the booking functions to make backend easier to implement - Richard
	
	public static boolean createBooking(Client user, int lotID, int spotID, int startTime, int endTime) {
		//ToDo
		
		 for (ParkingLot lot : lots) {
            		if (lot.getId() == lotID && lot.isSpotAvailable(spotID)) {
                		Booking booking = new Booking(user, lotID, spotID, startTime, endTime);
               			bookings.put(user, booking);
                		lot.setSpotAvailability(spotID, false);
                		return true;
            		}
        	}
        	
		return false;
	}
	
	public static boolean editBooking(Client user, int startTime, int endTime) {
		//ToDo

		if (bookings.containsKey(user)) {
            		Booking booking = bookings.get(user);
            		booking.setStartTime(startTime);
            		booking.setEndTime(endTime);
            		return true;
        	}
		
		return false;
	}
	
	public static boolean extendBooking(Client user, int endTime) {
		//ToDo
		
		if (bookings.containsKey(user)) {
            		Booking booking = bookings.get(user);
            		if (endTime > booking.getEndTime()) {
                		booking.setEndTime(endTime);
                		return true;
            		}
        	}
		 
		return false;
	}
	
	public static boolean cancelBooking(Client user) {
		//ToDo
		
		 if (bookings.containsKey(user)) {
            		Booking booking = bookings.remove(user);
            		for (ParkingLot lot : lots) {
                		if (lot.getId() == booking.getLotID()) {
                    			lot.setSpotAvailability(booking.getSpotID(), true);
                    			return true;
                		}
            		}
        	}
		
		return false;
	}
}
	// May have missunderstood the above ones cause it was boolean but if it doesn't make sense I'll fix in the morning. Just putting down thoughts mainly.
