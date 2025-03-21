package parking;

public class ParkingSpot extends ParkingLot {
    private int spotID;
    private boolean spotStatus;
    private Sensor sensor;

    public ParkingSpot(int lotID, int spotID) {
        super(lotID);
        this.spotID = spotID;
        this.spotStatus = true;
        this.sensor = new Sensor();
    }

    public int getSpotID() {
        return spotID;
    }

    public boolean isAvailable() {
        return spotStatus;
    }

    public void setAvailable(boolean status) {
        this.spotStatus = status;
    }

    public void updateSpot() {
        this.spotStatus = !sensor.isOccupied(); // not sure if this is enough but have it as this for now
    }
}

	// Feel free to change it if I made any glaring mistakes
