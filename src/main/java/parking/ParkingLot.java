package parking;

import java.util.ArrayList;

public class ParkingLot {

	private int lotID;
	private Boolean lotStatus;
	private ArrayList<Integer> spots;
	
	public ParkingLot(int lotID, int numSpots) {
		this.lotID = lotID;
		//ToDo: how are we generating spot ID
	}
}
