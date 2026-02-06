package src.LLd.Easy.stateDesignPatternRelated.VendingMachine;

public class DispanceState implements State{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("avi to paisa already hai");

    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println(" already selected");
    }

    @Override
    public void dispanceProduct(VendingMachine vendingMachine) {
        System.out.println("the product is dispancing");
        // change the state
        vendingMachine.setState(new NoCoinState());
    }
}
