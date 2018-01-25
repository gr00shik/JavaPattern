package by.gr00shik;

import by.gr00shik.context.TaleContext;
import by.gr00shik.pigs.NafNaf;
import by.gr00shik.pigs.NifNif;
import by.gr00shik.pigs.NufNuf;

public class MainApp {
    public static void main(String[] args) {
        TaleContext context = new TaleContext();
        context.setTaleContext(new NifNif());
        context.doHouse();
        context.setTaleContext(new NafNaf());
        context.doHouse();
        context.setTaleContext(new NufNuf());
        context.doHouse();
    }
}
