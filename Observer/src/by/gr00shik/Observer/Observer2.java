package by.gr00shik.Observer;

public class Observer2 implements Observer {
    @Override
    public void doAction(String str) {
        System.out.println("In Observer2 "+ str);
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName().toUpperCase();
    }
}
