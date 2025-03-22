package database;

import java.util.ArrayList;

import parking.Booking;

//ToDo money stuff needs to be implemented, a few methods not done

public class BookingDB {

	protected static ArrayList<Booking> bookings = new ArrayList<>();
	
	public static boolean addBooking(String user, String spotID, int startTime, int endTime) {
		if (!checkBooking(spotID, user, startTime, endTime))
			return false;
		
		char lotID = spotID.charAt(0);
		
		Booking newBooking = new Booking(user, lotID, spotID, startTime, endTime);
		bookings.add(newBooking);
		return true;
	}
	
	public static boolean editBooking(String user, String spotID, int startTime, int endTime) {
		// ToDo: check against current time and do the stuff
		// may want separate methods for extend/relocate
		// may want to do all the logic here
		// don't think changing spots is a requirement though, make a decision someone
		return false;
	}
	
	// remove all bookings belonging to user 
	public static boolean removeUserBooking(String user) {
		boolean flag = false;
		for (Booking b : bookings) {
			if (b.getClient().equals(user)) {
				bookings.remove(b);
				flag = true;
			} 
		}
		return flag;
	}
	
	// remove all bookings belonging to spot 
	public static boolean removeSpotBooking(String spotID) {
			boolean flag = false;
			for (Booking b : bookings) {
				if (b.getSpotID().equals(spotID)) {
					bookings.remove(b);
					flag = true;
				} 
			}
			return flag;
		}
	
	public static boolean checkBooking(String user, String spotID, int startTime, int endTime) {
		// ToDo: make sure userName is valid
		
		for (Booking b : bookings) {
			if (b.getClient().equals(user)) {
				return false;
			} 
			
			else if (b.getSpotID().equals(spotID)) {
				// new booking starts before
				if (b.getStartTime() > startTime) {
					if (endTime > b.getStartTime()) {
						return false;
					}
				}
				// new booking starts after
				else if (b.getStartTime() < startTime) {
					if (b.getEndTime() > startTime) {
						return false;
					}
				}
				// same start time
				else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static ArrayList<Booking> getBookings() {
		return bookings;
	}
	
	public static boolean updateBookings(int time) {
		return false;
	}
}
