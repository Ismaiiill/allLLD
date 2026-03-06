package src.LLd.Easy.stateDesignPatternRelated.atmMachine;

public interface AtmState {
    void cardPut();
    void makeTransaction();
    void dispance();
}
