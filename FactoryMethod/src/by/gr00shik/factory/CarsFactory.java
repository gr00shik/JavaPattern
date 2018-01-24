package by.gr00shik.factory;

import by.gr00shik.factory.car.Bike;
import by.gr00shik.factory.car.Car;
import by.gr00shik.factory.car.Ford;
import by.gr00shik.factory.car.Toyota;
import by.gr00shik.factory.road.Road;

public class CarsFactory {
    private static Car car=null;

    private CarsFactory() {
    }

    public static Car getCar(Road road) {
        switch (road){
            case CITYROAD:
                car = new Toyota();
                break;
            case VILLAGEROAD:
                car = new Ford();
                break;
            case WOODROAD:
                car = new Bike();
                break;
        }
        return car;
    }

}
