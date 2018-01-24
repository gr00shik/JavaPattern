package by.gr00shik;

import by.gr00shik.adaptor.AdaptorDatabase;
import by.gr00shik.database.Database;

public class MainApp {
    public static void main(String[] args) {
        Database database = new AdaptorDatabase();
        database.insert();
        database.remove();
        database.select();
        database.update();
    }
}
