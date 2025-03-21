package parking;

import java.util.ArrayList;

public class ParkingLot extends ParkingManagement {
    private int lotID;
    private boolean lotStatus;
    private ArrayList<ParkingSpot> spots;

    public ParkingLot(int lotID) {
        this.lotID = lotID;
        this.lotStatus = true;
        this.spots = new ArrayList<>();
    }

	public int getId() {
        return lotID;
    }

    public boolean isAvailable() {
        return lotStatus;
    }

    public void setAvailable(boolean lotStatus) {
        this.lotStatus = lotStatus;
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public boolean isSpotAvailable(int spotID) {
        for (ParkingSpot spot : spots) {
            if (spot.getId() == spotID) {
                return spot.isAvailable();
            }
        }
        return false;
    }

    public void setSpotAvailability(int spotID, boolean status) {
        for (ParkingSpot spot : spots) {
            if (spot.getId() == spotID) {
                spot.setAvailable(status);
                break;
            }
        }
    }
}
	// Feel free to change it if I made any glaring mistakes
