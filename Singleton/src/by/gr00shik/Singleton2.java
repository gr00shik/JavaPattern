package by.gr00shik;

public enum Singleton2 {
    INSTANCE;

    private int idSingle=0;

    Singleton2() {
        idSingle++;
        System.out.println("Enum Constructor ....");
    }

    public void doSomeThing(){
        System.out.println("idSingle = "+idSingle);
    }
}
