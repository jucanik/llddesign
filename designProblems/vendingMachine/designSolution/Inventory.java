package designProblems.vendingMachine.designSolution;

public class Inventory {

    private ItemSelf[] inventory;

    public Inventory(int itemCount) {
        inventory = new ItemSelf[itemCount];
        initializeEmptyInventory();
    }
    

    public ItemSelf[] getInventory() {
        return inventory;
    }


    public void setInventory(ItemSelf[] inventory) {
        this.inventory = inventory;
    }


    private void initializeEmptyInventory(){

    }

    private void addItem(Item item, int code){

    }

    private Item getItem(int code){
        updateItemCount(code);
        return null;
    }

    private void updateItemCount(int code){

    }
    

}
