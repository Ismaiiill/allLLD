package src.LLd.Easy.stateDesignPatternRelated.VendingMachine;

public class VendingMachine {
    private State state;
    public VendingMachine(){
        this.state=new NoCoinState();
    }
    public void setState(State state){
        this.state=state;
    }
    public void insertCoin(){
        state.insertCoin(this);
    }

    public void selectProduct(){
        state.selectProduct(this);
    }
    public void dispanceProduct(){
        state.dispanceProduct(this);
    }
}
