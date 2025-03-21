package parking;

public class Sensor {
    private String license;
    private boolean isOccupied;

    public Sensor() {
        this.license = "";
        this.isOccupied = false;
    }

    public String getLicense() {
        return license;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void scanSpot(String detectedLicense) {
        this.license = detectedLicense;
        this.isOccupied = !detectedLicense.isEmpty();
    }
}
