package GBJava;

import GBJava.vechicles.Car;
import GBJava.vechicles.Vehicle;

public class Main {

    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle("Motor", 10F, 2.5F);
//        vehicle.active();
        Car car = new Car("BMW", 13F,2.5F);
//        car.active();
        new Thread(() -> car.active()).start();
        new Thread(() -> vehicle.active()).start();
    }
}
