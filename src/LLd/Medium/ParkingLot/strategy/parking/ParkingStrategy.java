package src.LLd.Medium.ParkingLot.strategy.parking;

import src.LLd.Medium.ParkingLot.Floor;
import src.LLd.Medium.ParkingLot.Spots;
import src.LLd.Medium.ParkingLot.Vehicle;

import java.util.List;
import java.util.Optional;

public interface ParkingStrategy {
    Optional<Spots> findSpot(List<Floor> floors, Vehicle vehicle);
}
