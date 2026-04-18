package src.LLd.Medium.ParkingLot;

public class ParkingManager {
    //ekhane singleton design pattern ta ke implements korbo
    private static volatile ParkingManager parkingManager=null;
    private ParkingLot parkingLot;


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
    //create a floor
    public void createFloor(String id,String name,int length,int width){
        Floor newFloor=new Floor(id,name,length,width);
        parkingLot.addFloors(newFloor);
    }
    //assign a vehicles
    public void assignVehicle(VehicleType vehicleType){
        // find the best slot and assign
    }
    // check out a vehicles
    public int makePayment(Ve)
    //display the parking lots floor wish

    public void displayParkingLot() {
        for (int i=0;i<parkingLot.getFloors().size();i++){
            System.out.println("printing"+(i+1)+"th floor");
            parkingLot.getFloors().stream().forEach(floor -> floor.displayTheFloor());
        }
    }
}
