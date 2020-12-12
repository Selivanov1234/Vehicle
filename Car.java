package java2.vehicle;

import java2.station.FillingStation;

public class Car extends Vehicle {
    public Car(String name, float maxFuel, float fuelConsumption, FillingStation fillingStation) {
        super(name, maxFuel, fuelConsumption, fillingStation);
    }

    @Override
    public void active() {
        super.active();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void run() {
        super.run();
    }
}
