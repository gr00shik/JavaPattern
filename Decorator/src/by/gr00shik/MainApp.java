package by.gr00shik;

import by.gr00shik.decorator.ColorDecorator;
import by.gr00shik.decorator.ItalicDecorator;
import by.gr00shik.window.Table;
import by.gr00shik.window.Window;

public class MainApp {
    public static void main(String[] args) {

        Window window1 = new ColorDecorator(new Table());
        window1.paint();
        window1.setTitle();
        System.out.println("--------------");
        Window window2 = new ColorDecorator(new ItalicDecorator(new Table()));
        window2.paint();
        window2.setTitle();

    }
}
