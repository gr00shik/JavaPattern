package by.gr00shik;

public class Singleton1 {
    private static Singleton1 INSTANCE;
    private int idSingle=0;
    private Singleton1() {
        idSingle++;
        System.out.println("Singleton Constructor ....");
    }

    public static synchronized Singleton1 getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Singleton1();
            return INSTANCE;
        }
        else return INSTANCE;
    }

    public void doSomeThing(){
        System.out.println("idSingle = "+idSingle);
    }
}
