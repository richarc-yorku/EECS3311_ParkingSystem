package parking;


import java.util.ArrayList;

import user.Client;

public class ParkingManagement {
    private static ArrayList<ParkingLot> lots = new ArrayList<>();
    private static ArrayList<Booking> bookings = new ArrayList<>();

    public static void addLot(ParkingLot lot) {
        lots.add(lot);
    }

    public void setLotStatus(int lotID, boolean lotStatus) {
        for (ParkingLot lot : lots) {
            if (lot.getId() == lotID) {
                lot.setAvailable(lotStatus);
                break;
            }
        }
    }

    public static void setSpotStatus(int lotID, int spotID, boolean spotStatus) {
        for (ParkingLot lot : lots) {
            if (lot.getId() == lotID) {
                lot.setSpotAvailability(spotID, spotStatus);
                break;
            }
        }
    }

	//Client parameter was added to the booking functions to make backend easier to implement - Richard
	
    public static boolean createBooking(Client user, int lotID, int spotID, int startTime, int endTime) {
        for (ParkingLot lot : lots) {
            if (lot.getId() == lotID && lot.isSpotAvailable(spotID)) {
                lot.setSpotAvailability(spotID, false); // Mark spot as occupied
                bookings.add(new Booking(user, lotID, spotID, startTime, endTime));
                return true;
            }
        }
        return false;
    }
    public static boolean editBooking(Client user, int startTime, int endTime) {
        for (Booking booking : bookings) {
            if (booking.getClient().getUsername().equals(user.getUsername())) {
                booking.setStartTime(startTime);
                booking.setEndTime(endTime);
                return true;
            }
        }
        return false;
    }

    public static boolean extendBooking(Client user, int endTime) {
        for (Booking booking : bookings) {
            if (booking.getClient().getUsername().equals(user.getUsername())) {
                booking.setEndTime(endTime);
                return true;
            }
        }
        return false;
    }

    public static boolean cancelBooking(Client user) {
        for (Booking booking : bookings) {
            if (booking.getClient().getUsername().equals(user.getUsername())) {
                bookings.remove(booking);
                for (ParkingLot lot : lots) {
                    if (lot.getId() == booking.getLotID()) {
                        lot.setSpotAvailability(booking.getSpotID(), true);
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
	// May have missunderstood the above ones cause it was boolean but if it doesn't make sense I'll fix in the morning. Just putting down thoughts mainly.

class Booking {
    	private Client user;
    	private int lotID;
    	private int spotID;
    	private int startTime;
    	private int endTime;
    
    public Booking(Client user, int lotID, int spotID, int startTime, int endTime) {
        	this.user = user;
        	this.lotID = lotID;
        	this.spotID = spotID;
        	this.startTime = startTime;
        	this.endTime = endTime;
    }
    
    public Client getClient() {
        return user;
    }
    
	public int getLotID() {
		return lotID;
	}
	    
	public int getSpotID() {
		return spotID;
	}
	    
	public int getStartTime() {
	        return startTime;
	}
	    
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	    
	public int getEndTime() {
	        return endTime;
	}
	    
	public void setEndTime(int endTime) {
	        this.endTime = endTime;
	}
}
	
