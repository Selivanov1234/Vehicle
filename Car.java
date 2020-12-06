package GBJava.vechicles;

public class Car extends Vehicle {

    public Car(String name, float maxFuel, float fuelConsumption) {
        super(name, maxFuel, fuelConsumption);
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
