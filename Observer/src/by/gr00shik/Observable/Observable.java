package by.gr00shik.Observable;

import by.gr00shik.Observer.Observer;

import java.util.List;

public interface Observable {
    List<Observer> getAllObserver();
    boolean addObserver(Observer observer);
    boolean removeObserver(Observer observer);
    void notifyAllObservers(String str);
    void doChanges();

}
