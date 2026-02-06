package src.LLd.Easy.stateDesignPatternRelated.VendingMachine;

public class NoCoinState implements State{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("insert the coin");
        vendingMachine.setState(new HasCoinStateOrSelectProductState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("insert the coin first");

    }

    @Override
    public void dispanceProduct(VendingMachine vendingMachine) {
        System.out.println("insert the coin first");
    }
}
