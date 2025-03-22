package database;

import java.io.File;
import java.io.FileWriter;
import java.net.URISyntaxException;
import java.util.Scanner;

import user.Manager;
import user.User;
import parking.Booking;

// ToDo: some methods

public class DatabaseLoader {
    
    static String dir;
    static File file;

    // initialize everything from file
	public static void open() {
		try {
			dir = new File(DatabaseLoader.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		readClients();
		readSpots();
		readBookings();
	}
	
	// save everything to file
	public static void close() {
		writeClients();
		writeSpots();
		writeBookings();
	}
	
	// load client data
	private static void readClients() {
		try {
			// create file reference
            File file = new File(dir, "clients.txt");
            
            // ensure it actually exists
            if (!file.exists()) {
                if (!file.createNewFile())
                	throw new Exception("error, could not create file!");
            }
            
            // scan
            Scanner fScanner = new Scanner(file).useDelimiter(",");
			while (fScanner.hasNext()) {
				int type = fScanner.nextInt();
				String username = fScanner.next();
				String password = fScanner.next();
				int validation = fScanner.nextInt();

				// populate
				if (type == 0) {
					ClientDB.createManager(username, password);
				} else {
					ClientDB.createUser(username, password, type, validation == 1);
				}
			} fScanner.close();
			
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private static void writeClients() {
		try {
			// create file reference
            File file = new File(dir, "clients.txt");
            
            // ensure it actually exists
            if (!file.exists()) {
                if (!file.createNewFile())
                	throw new Exception("error, could not create file!");
            }
            
            FileWriter writer = new FileWriter(file, false);
            for (User u : ClientDB.users) {
            	writer.write(u.getType() + "," + u.getUsername() + "," 
            			+ u.getPassword() + "," + u.getValidation() + ",");
            	
            } for (Manager m : ClientDB.managers) {
            	writer.write("0," + m.getUsername() + "," 
            			+ m.getPassword() + ",0,");
            	
            }writer.close();
			
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private static void readSpots() {
		try {
			// create file reference
            File file = new File(dir, "Lots.txt");
            
            // ensure it actually exists
            if (!file.exists()) {
                if (!file.createNewFile())
                	throw new Exception("error, could not create file!");
            }
            
            // scan
            Scanner fScanner = new Scanner(file).useDelimiter(",");
			while (fScanner.hasNext()) {
				// ToDo: figure out how to represent spots proper
				
			} fScanner.close();
			
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private static void writeSpots() {
		// ToDo: what it says on the tin
	}
	
	private static void readBookings() {
		try {
			// create file reference
            File file = new File(dir, "bookings.txt");
            
            // ensure it actually exists
            if (!file.exists()) {
                if (!file.createNewFile())
                	throw new Exception("error, could not create file!");
            }
            
            // scan
            Scanner fScanner = new Scanner(file).useDelimiter(",");
			while (fScanner.hasNext()) {
				String user = fScanner.next();
				String spot = fScanner.next();
				int start = fScanner.nextInt();
				int end = fScanner.nextInt();
				
				BookingDB.addBooking(user, spot, start, end);
				
			} fScanner.close();
			
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private static void writeBookings() {
		try {
			// create file reference
            File file = new File(dir, "bookings.txt");
            
            // ensure it actually exists
            if (!file.exists()) {
                if (!file.createNewFile())
                	throw new Exception("error, could not create file!");
            }
            
            FileWriter writer = new FileWriter(file, false);
            for (Booking b : BookingDB.bookings) {
            	writer.write(b.getClient() + "," + b.getSpotID() + "," 
            			+ b.getStartTime() + "," + b.getEndTime() + ",");
            	
            } writer.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
