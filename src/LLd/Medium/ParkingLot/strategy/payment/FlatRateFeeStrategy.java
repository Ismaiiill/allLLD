package src.LLd.Medium.ParkingLot.strategy.payment;

import src.LLd.Medium.ParkingLot.ParkingTicket;

public class FlatRateFeeStrategy implements PaymentStrategy {
    @Override
    public double calculateFare(ParkingTicket ticket) {
        return 0;
    }
}
