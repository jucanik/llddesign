package designProblems.vendingMachine.designSolution.vendingMachineState.impl;

import designProblems.vendingMachine.designSolution.Coin;
import designProblems.vendingMachine.designSolution.Inventory;
import designProblems.vendingMachine.designSolution.Item;
import designProblems.vendingMachine.designSolution.ItemSelf;
import designProblems.vendingMachine.designSolution.VendingMachine;
import designProblems.vendingMachine.designSolution.vendingMachineState.State;

public class DispenseState implements State{

    public DispenseState(VendingMachine vendingMachine, int code){

    }

    @Override
    public void clickonInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickonInsertCoinButton'");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void selectProductButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        ven
        throw new UnsupportedOperationException("Unimplemented method 'selectProductButton'");
    }

    @Override
    public void selectProductCode(VendingMachine vendingMachine, int code) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProductCode'");
    }

    @Override
    public int getChange(VendingMachine vendingMachine, int moneyPaid) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public void refundMoney(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundMoney'");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        // TODO Auto-generated method stub
        Inventory inventory = vendingMachine.getInventory();int i=0;
        vendingMachine.setVendingMachineState(new IdleState());
        ItemSelf[] itemSelf = inventory.getInventory();
        for(i=0;i<itemSelf.length;i++){
            if(itemSelf[i].getCode()==code){
                return itemSelf[i].getItem();
            }
        }
        return null;
    }

}
