package by.gr00shik.factory.car;

import by.gr00shik.factory.car.Car;

public class Ford implements Car {
    @Override
    public void run() {
        System.out.println("Ford run on road");
    }

    @Override
    public void stop() {
        System.out.println("Ford was stoped");
    }
}
