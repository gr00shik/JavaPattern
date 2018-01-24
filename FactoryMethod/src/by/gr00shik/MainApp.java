package by.gr00shik;

import by.gr00shik.factory.CarsFactory;
import by.gr00shik.factory.car.Car;
import by.gr00shik.factory.road.Road;

public class MainApp {
    public static void main(String[] args) {
        Car car1 = CarsFactory.getCar(Road.CITYROAD);
        car1.run();
        car1.stop();
        Car car2 = CarsFactory.getCar(Road.VILLAGEROAD);
        car2.run();
        car2.stop();
        Car car3 = CarsFactory.getCar(Road.WOODROAD);
        car3.run();
        car3.stop();


    }
}
