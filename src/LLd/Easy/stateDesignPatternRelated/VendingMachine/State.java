package src.LLd.Easy.stateDesignPatternRelated.VendingMachine;

public interface State {
    void insertCoin(VendingMachine vendingMachine);
    void selectProduct(VendingMachine vendingMachine);
    void dispanceProduct(VendingMachine vendingMachine);
}
