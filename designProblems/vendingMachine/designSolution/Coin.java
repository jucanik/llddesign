package designProblems.vendingMachine.designSolution;

public enum Coin {

    PENNY(1),
    NIKEL(5),
    DIME(10),
    QUARTER(20);

    private int value;

    Coin(int value){
        this.value = value;
    }

}
