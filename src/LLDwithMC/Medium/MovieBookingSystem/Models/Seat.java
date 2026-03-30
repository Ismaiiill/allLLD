package src.LLDwithMC.Medium.MovieBookingSystem.Models;

import src.LLDwithMC.Medium.MovieBookingSystem.enums.SeatStatus;
import src.LLDwithMC.Medium.MovieBookingSystem.enums.SeatType;

public class Seat {
    private Long id;
    private SeatType seatType;
    private SeatStatus seatStatus;
    private double price;
}
