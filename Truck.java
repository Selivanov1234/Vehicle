package java2.vehicle;

import java2.station.FillingStation;

public class Truck extends Vehicle {
    public Truck(String name, float maxFuel, float fuelConsumption, FillingStation fillingStation) {
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
