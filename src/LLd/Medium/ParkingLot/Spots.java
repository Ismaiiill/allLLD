package src.LLd.Medium.ParkingLot;

public class Spots {
    private SpotType spotType=SpotType.EMPTY;
    private String spotId;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    public Spots(SpotType spotType, String spotId, boolean isOccupied, Vehicle parkedVehicle) {
        this.spotType = spotType;
        this.spotId = spotId;
        this.isOccupied = isOccupied;
        this.parkedVehicle = parkedVehicle;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }
}
