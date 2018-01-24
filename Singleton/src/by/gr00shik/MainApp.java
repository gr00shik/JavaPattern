package by.gr00shik;

public class MainApp {
    public static void main(String[] args) {
        Singleton1 singl1_1 = Singleton1.getInstance();
        Singleton1 singl1_2 = Singleton1.getInstance();
        singl1_1.doSomeThing();
        singl1_2.doSomeThing();

        Singleton2 singl2_1 = Singleton2.INSTANCE;
        singl2_1.doSomeThing();
        Singleton2 singl2_2 = Singleton2.INSTANCE;
        singl2_2.doSomeThing();

    }
}
