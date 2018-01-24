package by.gr00shik.decorator;

import by.gr00shik.window.Window;

public class ItalicDecorator extends AbstractDecorator {
    public ItalicDecorator(Window window) {
        super(window);
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Set Italic Paint .....");
    }

    @Override
    public void setTitle() {
        super.setTitle();
        System.out.println("Set Italic Text ....");
    }
}
