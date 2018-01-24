package by.gr00shik.decorator;

import by.gr00shik.window.Window;

public class ColorDecorator extends AbstractDecorator {
    public ColorDecorator(Window window) {
        super(window);
    }

    @Override
    public void paint() {
        super.paint();
        System.out.println("Set Black and White theme");
    }

    @Override
    public void setTitle() {
        super.setTitle();
        System.out.println("Set Black and White color Text");
    }
}
