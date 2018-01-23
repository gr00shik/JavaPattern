package by.gr00shik;

import by.gr00shik.Observable.MyObservableClass;
import by.gr00shik.Observer.Observer1;
import by.gr00shik.Observer.Observer2;

public class MainApp {
    public static void main(String[] args) {
        MyObservableClass observableClass = new MyObservableClass();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        System.out.println("add new observer1 = "+ observableClass.addObserver(observer1));
        System.out.println("add new observer2 = "+ observableClass.addObserver(observer2));
        System.out.println("add new observer1 = "+ observableClass.addObserver(observer1));
        System.out.println("del observer2 = "+ observableClass.removeObserver(observer2));
        System.out.println("del observer2 too = "+ observableClass.removeObserver(observer2));
        System.out.println("add new observer2 = "+ observableClass.addObserver(observer2));
        System.out.println("return all observers = "+ observableClass.getAllObserver());
//       Call changing in Observable class, return message about this event
        observableClass.doChanges();
    }
}
