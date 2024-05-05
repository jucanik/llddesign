package observer;

import observer.observable.AndroidObservableImpl;
import observer.observable.IphoneObservableImpl;
import observer.observable.StocksObservable;
import observer.observer.EmailAlertObserver;
import observer.observer.MobileAlertObserver;
import observer.observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args){
        StocksObservable ipStocksObservable = new IphoneObservableImpl();
        StocksObservable androidStocksObservable = new AndroidObservableImpl();
        NotificationAlertObserver mobileAlertObserver = new EmailAlertObserver("anik.patraju@gmail.comn", ipStocksObservable);
        NotificationAlertObserver emailAlertObserver = new MobileAlertObserver("anikp", ipStocksObservable);
        NotificationAlertObserver androidMobileAlertObserver = new EmailAlertObserver("anik.patraju@gmail.comn", androidStocksObservable);
        NotificationAlertObserver androidEmailAlertObserver = new MobileAlertObserver("anikp", androidStocksObservable);
        ipStocksObservable.add(mobileAlertObserver);
        ipStocksObservable.add(emailAlertObserver);
        androidStocksObservable.add(androidEmailAlertObserver);
        androidStocksObservable.add(androidMobileAlertObserver);
        ipStocksObservable.setData(10);
        androidStocksObservable.setData(100);
    }
}
