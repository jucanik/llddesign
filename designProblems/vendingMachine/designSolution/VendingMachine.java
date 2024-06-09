package designProblems.vendingMachine.designSolution;

import designProblems.vendingMachine.designSolution.vendingMachineState.State;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private Inventory inventory;
    private State vendingMachineState;
    private List<Coin> coinList;
    

    public VendingMachine(final State state, int inventorySize){
        this.vendingMachineState = state;
        this.inventory = new Inventory(inventorySize);
        this.coinList = new ArrayList<>();
    }


    public Inventory getInventory() {
        return inventory;
    }


    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public State getVendingMachineState() {
        return vendingMachineState;
    }


    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }


    public List<Coin> getCoinList() {
        return coinList;
    }


    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }


    
    

}
