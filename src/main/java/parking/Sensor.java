package parking;

public class Sensor {
	
	private String license;
	private Boolean isOccupied;
	
	public Sensor() {
		license = "";
		isOccupied = false;
	}
	
	public void scanSpot() {
		//ToDo: update license & isOccupied
	}
	
	public String getLicense() {
		return license;
	}
}
