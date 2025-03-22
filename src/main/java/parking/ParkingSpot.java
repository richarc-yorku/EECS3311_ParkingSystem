package parking;

public class ParkingSpot{
    private String spotID;
    private boolean spotStatus;
    private Sensor sensor;

    public ParkingSpot(String spotID, boolean spotStatus) {
        this.spotID = spotID;
        this.spotStatus = true;
        this.sensor = new Sensor();
    }

    public boolean getStatus() {
        return spotStatus;
    }

    public void setStatus(boolean status) {
    	this.spotStatus = status;
    }
    
    // pretty sure this should simulate the sensor reading something and
    // return instead of setting - richard
    public void updateSpot(String detectedLicense) {
        sensor.scanSpot(detectedLicense);
        this.spotStatus = !sensor.isOccupied();
    }
}

	// Feel free to change it if I made any glaring mistakes
