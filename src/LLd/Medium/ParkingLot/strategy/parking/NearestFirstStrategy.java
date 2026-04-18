package src.LLd.Medium.ParkingLot.strategy.parking;

import src.LLd.Medium.ParkingLot.Floor;
import src.LLd.Medium.ParkingLot.ParkingTicket;
import src.LLd.Medium.ParkingLot.Spots;
import src.LLd.Medium.ParkingLot.Vehicle;
import src.LLd.Medium.ParkingLot.strategy.payment.PaymentStrategy;

import java.util.List;
import java.util.Optional;

public class NearestFirstStrategy implements ParkingStrategy {

    @Override
    public Optional<Spots> findSpot(List<Floor> floors, Vehicle vehicle) {
        return Optional.empty();
    }
}
