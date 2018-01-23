package by.gr00shik.Observer;

public class Observer1 implements Observer {
    @Override
    public void doAction(String str) {
        System.out.println("In Observer 1 "+ str);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().toUpperCase();
    }
}
