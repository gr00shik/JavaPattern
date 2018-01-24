package by.gr00shik.decorator;

import by.gr00shik.window.Window;

public class AbstractDecorator implements Window {
    private Window window;

    public AbstractDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void paint() {
        window.paint();
    }

    @Override
    public void setTitle() {
        window.setTitle();
    }
}
