package src.LLd.Medium.ParkingLot;

import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private String vehicleId;
    private Spots spots;

    public ParkingTicket(String ticketId, LocalDateTime entryTime, LocalDateTime exitTime, String  vehicleId, Spots spots) {
        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.vehicleId = vehicleId;
        this.spots = spots;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public String  getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String  vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Spots  getSpots() {
        return spots;
    }

    public void setSpotId(Spots spots) {
        this.spots = spots;
    }
}
