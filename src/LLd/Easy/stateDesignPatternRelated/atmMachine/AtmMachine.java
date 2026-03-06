package src.LLd.Easy.stateDesignPatternRelated.atmMachine;

public class AtmMachine {
    private  AtmState atmState;
    public AtmMachine(){
        this.atmState=new IdleState();
    }
    public void setState(AtmState atmState){
        this.atmState=atmState;
    }

}
