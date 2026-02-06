package src.LLd.Easy.stateDesignPatternRelated.VendingMachine;

public class HasCoinStateOrSelectProductState implements State{
    @Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("already coin inserted");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("select the product");
        vendingMachine.setState(new DispanceState());

    }

    @Override
    public void dispanceProduct(VendingMachine vendingMachine) {
        System.out.println("just put the coin before");
    }
}
