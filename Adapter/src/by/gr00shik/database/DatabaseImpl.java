package by.gr00shik.database;

public class DatabaseImpl implements Database {
    @Override
    public void insert() {
        System.out.println("Making insert ...");
    }

    @Override
    public void select() {
        System.out.println("Making select ...");

    }

    @Override
    public void update() {
        System.out.println("Making update ...");
    }

    @Override
    public void remove() {
        System.out.println("Making remove ...");
    }
}
