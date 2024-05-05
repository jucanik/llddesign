package observer.observable;

import observer.observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver displayObserver);

    void remove(NotificationAlertObserver displayObserver);

    void notifyObservers();

    void setData(int temp);

    int getData();

}
