package by.gr00shik.window;

public class Table implements Window {
    @Override
    public void paint() {
        System.out.println("Table paint ...");
    }

    @Override
    public void setTitle() {
        System.out.println("Table title set ....");
    }
}
