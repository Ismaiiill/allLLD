package src.LLd.Medium.Cricbuzz;


import java.util.ArrayList;
import java.util.List;

//match is a subject
public class Match implements Subject{
    private String id;
    private String teamA;
    private String teamB;
    private int scoreA;
    private int scoreB;
    private Status status;
    private List<Observer> observers=new ArrayList<>();

    void updateScore(int scoreA, int scoreB){
        this.scoreA=scoreA;
        this.scoreB=scoreB;

    }
    String getDetails(){
        return id + ": " + teamA + " " + scoreA + " vs " + teamB + " " + scoreB + " (" + status + ")";
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }

    }
}
