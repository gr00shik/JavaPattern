package by.gr00shik.Observable;

import by.gr00shik.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MyObservableClass implements Observable {
    List<Observer> list = new ArrayList<>();
    @Override
    public List<Observer> getAllObserver() {
        return list;
    }

    @Override
    public boolean addObserver(Observer observer) {
        if(list.contains(observer)) return false;
        else {
            list.add(observer);
            return true;
        }
    }

    @Override
    public boolean removeObserver(Observer observer) {
        if(list.contains(observer)) {
            list.remove(observer);
            return true;
        } else
        return false;
    }

    @Override
    public void notifyAllObservers(String str) {
        for(Observer observer : list){
            observer.doAction(str);
        }
    }

    @Override
    public void doChanges() {
        this.notifyAllObservers("SomeThing change");
    }
}
