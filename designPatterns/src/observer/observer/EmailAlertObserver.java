package observer.observer;

import observer.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserver(String userName, StocksObservable stocksObservable){
        this.emailId = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("Send the Email Notification to emailId"+ emailId + "current stock count is"+ stocksObservable.getData());
    }
}
