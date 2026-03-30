package src.LLDwithMC.Medium.MovieBookingSystem.Models;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private Long id;
    private String name;
    private List<ScreenOrRoom> showList=new ArrayList<>();

    public Theater(Long id, String name){
        this.id=id;
        this.name=name;
    }
}
