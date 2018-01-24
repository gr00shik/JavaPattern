package by.gr00shik.factory.car;

import by.gr00shik.factory.car.Car;

public class Toyota implements Car {
    @Override
    public void run() {
        System.out.println("Toyota run on road");
    }

    @Override
    public void stop() {
        System.out.println("Toyota was stoped");
    }
}
