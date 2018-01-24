package by.gr00shik.window;

public class Form implements Window {
    @Override
    public void paint() {
        System.out.println("Form paint ...");
    }

    @Override
    public void setTitle() {
        System.out.println("Form Title set ...");
    }
}
