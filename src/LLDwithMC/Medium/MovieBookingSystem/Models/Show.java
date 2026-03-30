package src.LLDwithMC.Medium.MovieBookingSystem.Models;
import src.LLDwithMC.Medium.MovieBookingSystem.strategy.pricing.PricingStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Show {
    private Long id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Movie movie;
    private PricingStrategy pricingStrategy;

}
