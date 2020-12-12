package java2;

import java2.station.FillingStation;
import java2.vehicle.Bus;
import java2.vehicle.Car;
import java2.vehicle.Truck;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        FillingStation fuelStation = new FillingStation();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Car("BMW", 25, 2.5F, fuelStation));
        executorService.submit(new Car("TOYOTA", 25, 2.5F, fuelStation));
        executorService.submit(new Car("MERCEDES", 25, 2.5F, fuelStation));
        executorService.submit(new Car("HONDA", 25, 2.5F, fuelStation));
        executorService.submit(new Truck("VOLVO", 60, 15F, fuelStation));
        executorService.submit(new Truck("RENAULT", 60, 15F, fuelStation));
        executorService.submit(new Truck("KAMAZ", 60, 15F, fuelStation));
        executorService.submit(new Bus("PAZ", 40, 7.5F, fuelStation));
        executorService.submit(new Car("UZDEO", 40, 7.5F, fuelStation));
        executorService.submit(new Car("Hyundai", 40, 7.5F, fuelStation));



        executorService.shutdown();
    }
}
