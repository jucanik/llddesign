package observer.observable;
import java.util.ArrayList;
import java.util.List;

import observer.observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> displayObserverList;
    int stockCount;

    public IphoneObservableImpl(){
        this.displayObserverList = new ArrayList<>();
        this.stockCount = 0;
    }

    @Override
    public void add(NotificationAlertObserver displayObserver){
        displayObserverList.add(displayObserver);
    }

    @Override
    public void remove(NotificationAlertObserver displayObserver) {
        // TODO Auto-generated method stub
        displayObserverList.remove(displayObserver);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for(NotificationAlertObserver displayObserver: displayObserverList){
            displayObserver.update();
        }
    }

    @Override
    public void setData(int newStockAdded) {
        // TODO Auto-generated method stub
        if(this.stockCount==0){
            this.stockCount=this.stockCount+newStockAdded;
            notifyObservers();
        } else{
            this.stockCount=this.stockCount+newStockAdded;
        }
    }

    @Override
    public int getData() {
        // TODO Auto-generated method stub
        return this.stockCount;
    }
}
