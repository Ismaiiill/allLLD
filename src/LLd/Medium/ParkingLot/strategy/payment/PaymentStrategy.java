package src.LLd.Medium.ParkingLot.strategy.payment;

import src.LLd.Medium.ParkingLot.ParkingTicket;

public interface PaymentStrategy {
    double calculateFare(ParkingTicket ticket);
}
