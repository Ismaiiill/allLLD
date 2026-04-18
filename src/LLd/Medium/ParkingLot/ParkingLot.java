package src.LLd.Medium.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String id;
    private String name;
    private List<Floor> floors=new ArrayList<>();

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }


    public ParkingLot(String id,String name){
        this.id=id;
        this.name=name;
    }
    public void addFloors(Floor floor){
        floors.add(floor);
    }
}
