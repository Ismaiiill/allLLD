package src.LLd.Medium.ParkingLot;

import src.LLd.Medium.ParkingLot.strategy.parking.ParkingStrategy;
import src.LLd.Medium.ParkingLot.strategy.payment.PaymentStrategy;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class ParkingManager {
    private static volatile ParkingManager parkingManager=null;
    private ParkingLot parkingLot;
    private PaymentStrategy paymentStrategy;
    private Map<String,ParkingTicket> tickets=new HashMap<>();
    private ParkingStrategy parkingStrategy;


    //ekhane singleton design pattern ta ke implements korbo
    public ParkingManager getInstance(){
        if(parkingManager==null){
            synchronized (this){
                if (parkingManager==null){
                    return parkingManager=new ParkingManager();
                }
            }
        }
        return parkingManager;
    }

    private ParkingManager(){
    }


    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void createParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public ParkingStrategy getParkingStrategy() {
        return parkingStrategy;
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public Map<String, ParkingTicket> getTickets() {
        return tickets;
    }

    //create a floor
    public void addFloors(String id,String name,int length,int width){
        Floor newFloor=new Floor(id,name,length,width);
        parkingLot.addFloors(newFloor);
    }
    //assign a vehicles
    public void assignVehicle(Vehicle vehicle){
        // create a ticket
        Optional<Spots> spots=getParkingStrategy().findSpot(getParkingLot().getFloors(),vehicle);
        if(spots.isEmpty()) throw new RuntimeException();
        Spots spots1= spots.get();
        ParkingTicket ticket=new ParkingTicket(UUID.randomUUID().toString()+vehicle.getId(), LocalDateTime.now(),null,vehicle.getId(),spots1);
        tickets.put(vehicle.getId(), ticket);

    }
    // check out a vehicles
    public int makePaymentOrUnparked(String vehicleId){
        //find the vehicles
        ParkingTicket ticket=tickets.get(vehicleId);
        ticket.setExitTime(LocalDateTime.now());
        ticket.getSpots().setOccupied(false);

        //calculate the time and fees
        double money=paymentStrategy.calculateFare(ticket);

        //set the exit time of the ticket and set the spot free
        return 0;
    }

    //display the parking lots floor wish
    public void displayParkingLot() {
        for (int i=0;i<parkingLot.getFloors().size();i++){
            System.out.println("printing"+(i+1)+"th floor");
            parkingLot.getFloors().stream().forEach(floor -> floor.displayTheFloor());
        }
    }
}
