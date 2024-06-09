package designProblems.vendingMachine.designSolution.vendingMachineState;

import designProblems.vendingMachine.designSolution.Coin;
import designProblems.vendingMachine.designSolution.Item;
import designProblems.vendingMachine.designSolution.VendingMachine;

/* State interface defines all the operations that different states provide */

public interface State {

    public void clickonInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    public void selectProductButton(VendingMachine vendingMachine);

    public void selectProductCode(VendingMachine vendingMachine, int code);

    public int getChange(VendingMachine vendingMachine, int moneyPaid) throws Exception;

    public void refundMoney(VendingMachine vendingMachine);

    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;

}
