package by.gr00shik.factory.car;

import by.gr00shik.factory.car.Car;

public class Bike implements Car {
    @Override
    public void run() {
        System.out.println("Bike run on road");
    }

    @Override
    public void stop() {
        System.out.println("Bike was stoped");
    }
}
