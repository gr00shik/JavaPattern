package by.gr00shik.adaptor;

public abstract class AbstractAdaptor {
    void insertObject(){
        System.out.println("Making insertObject ....");
    };
    void selectObject(){
        System.out.println("Making selectObject ....");
    };
    void updateObject(){
        System.out.println("Making updateObject ....");
    };
    void removeObject(){
        System.out.println("Making removeObject ...");
    }
}
