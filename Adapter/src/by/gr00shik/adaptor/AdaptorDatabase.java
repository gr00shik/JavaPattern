package by.gr00shik.adaptor;

import by.gr00shik.database.Database;

public class AdaptorDatabase extends AbstractAdaptor implements Database {
    @Override
    public void insert() {
        this.insertObject();
    }

    @Override
    public void select() {
        this.selectObject();
    }

    @Override
    public void update() {
        this.updateObject();
    }

    @Override
    public void remove() {
        this.removeObject();
    }
}
