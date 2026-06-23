package src.LLd.Medium.ParkingLot.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotMain {
}
/**
 * ===========design a parking lot=======
 * ## FUNCTIONAL REQ
 *  1. multi F
 *  2. bike, car, Truck
 *  3. payment
 *  4. payment strategy for multiple V
 *  5. Generate a ticket on entry and free up the space and pay at exit
 *
 * ##   NON-FUNCTIONAL REQ
 *  1. extensible
 *  2. manageable
 *
 *  ##   CORE ENTITIES
// *  1. parkingLotManager
 *  2. parkingLot
 *  3. floor
 *  4. spot
 *  5. ticket
 *  6. payment
 *
 *
 *  ## ENUMS
 *  vehicle types : bike, car, truck
 *  spotType
 *
 *  parkVehicle(Vehicle vehicle){
 *
 *  }
 *  createTicket(){
 *
 *  }
 *      ^
 *      |
 *  unparkVehicle(String ticketId){
 *
 *  }
 *      ^
 *      |
 *  pay(String ticketId){
 *
 *  }
 *
 *  displayAllSpots(){
 *
 *  }
 *
 *
 */


class ParkingLot{
    private static ParkingLot instance=null;
    private List<Floor> floors=new ArrayList<>();
    private Map<String,Ticket> tickets=new HashMap<>();
    private ParkingLot(){};

    public static ParkingLot getInstance(){
        if (instance==null){
            instance=new ParkingLot();
        }
        return instance;
    }

  void parkVehicle(Vehicle vehicle){
        //find the appropriate floor
      for(Floor floor:floors){
          for (Spot spot:floor.)
      }

        //find the appropriate spots

        createTicket();

  }
  void createTicket(){

  }

  void   unparkVehicle(String ticketId){

        pay(ticketId);

  }

  void   pay(String ticketId){

  }

  void   displayAllSpots(){

  }

}
class Vehicle{
    private String vehicleId;
    private VehicleTyype vehicleTyype;
}
enum VehicleTyype{
    BIKE,
    CAR,
    TRUCK
}
class Floor{
    private String floorId;
    private List<Spot> spots=new ArrayList<>();

    void display(){
        for (Spot spot:spots){
            System.out.print();
        }
    }
    void

}
class Spot{
    private String spotId;
    private SpotTyype spotTyype;
    private Boolean isAvalable=true;
    private Vehicle parkedVehicle;

}
enum SpotTyype{
    SMALL,
    MEDIUM,
    LARGE
}

class Ticket{
    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime started=LocalDateTime.now();
    private LocalDateTime ended;


}

interface pay{
    double calculateFee(long hour);
}

class PayForBike implements pay{

    @Override
    public double calculateFee(long hour) {
        return 12.45*hour;
    }
}

class PayForCar implements pay{

    @Override
    public double calculateFee(long hour) {
        return 120.45*hour;
    }
}

class PayForTruck implements pay{

    @Override
    public double calculateFee(long hour) {
        return 320.45*hour;
    }
}