package designProblems.vendingMachine.designSolution.vendingMachineState.impl;

import designProblems.vendingMachine.designSolution.Coin;
import designProblems.vendingMachine.designSolution.Item;
import designProblems.vendingMachine.designSolution.VendingMachine;
import designProblems.vendingMachine.designSolution.vendingMachineState.State;

public class InsertCoinState implements State{

    public InsertCoinState(){
        System.out.println("Insert coins for the product");
    }

    @Override
    public void clickonInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickonInsertCoinButton'");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void selectProductButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        System.out.println("Product Selecet Button");
        vendingMachine.setVendingMachineState(new ProductSelectionState());
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
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

}
