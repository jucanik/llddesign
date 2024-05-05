package observer.observer;

import observer.observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObserver(String userName, StocksObservable stocksObservable){
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendPush();
    }

    private void sendPush(){
        System.out.println("Send the Push Notification to userName"+ userName + "current stock count is"+ stocksObservable.getData());
    }

}
