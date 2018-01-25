package by.gr00shik;

import by.gr00shik.facade.SputnicFacade;

public class MainApp {
    public static void main(String[] args) {
        SputnicFacade facade = new SputnicFacade();
        facade.run();
    }
}
