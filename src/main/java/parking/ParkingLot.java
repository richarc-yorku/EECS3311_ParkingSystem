package parking;

import java.util.ArrayList;

public class ParkingLot {
    private char lotID;
    private boolean lotStatus;
    private ParkingSpot[] spots;
    
    public ParkingLot(char lotID, boolean lotStatus, ParkingSpot[] spots) {
        this.lotID = lotID;
        this.lotStatus = lotStatus;
        this.spots = spots;
    }

    public char getID() {
    	return lotID;
    }
    
    public boolean getStatus() {
        return lotStatus;
    }

    public void setStatus(boolean status) {
        this.lotStatus = status;
    }
    
    // this passes a reference, do not send a copy
    
    public ParkingSpot[] getSpots(){
    	return spots;
    }
}
