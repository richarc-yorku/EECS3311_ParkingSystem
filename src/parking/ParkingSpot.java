package parking;

public class ParkingSpot {
	
	private int spotID;
	private Boolean spotStatus;
	private Sensor sensor;
	
	public ParkingSpot(int spotID) {
		this.spotID = spotID;
		spotStatus = true;
		sensor = new Sensor();
	}
	
	public void updateSpot() {
		//ToDo
	}
	
	public int getID() {
		return spotID;
	}
	
	public Boolean getStatus() {
		return spotStatus;
	}
}
