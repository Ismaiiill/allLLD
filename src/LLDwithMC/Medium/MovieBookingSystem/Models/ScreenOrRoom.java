package src.LLDwithMC.Medium.MovieBookingSystem.Models;

import java.util.ArrayList;
import java.util.List;

public class ScreenOrRoom {
    private Long id;
    private Show show;
    private List<Seat>seatList=new ArrayList<>();
    private int totalSeat;
}
