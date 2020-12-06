package GBJava.vechicles;

import java.util.concurrent.TimeUnit;

public class Vehicle implements Runnable {
    private String name;
    private float currentFuel;
    private float maxFuel;
    private float fuelConsumption;
    private boolean active = true;

    public Vehicle(String name, float maxFuel, float fuelConsumption) {
        this.name = name;
        this.maxFuel = maxFuel;
        this.fuelConsumption = fuelConsumption;
        currentFuel = maxFuel;
    }

    public void active() {
            System.out.println(String.format("The %s's tank has %s gallons of fuel in it", this.getName(), currentFuel));
            for (float i = fuelConsumption; currentFuel != 0; ) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                currentFuel = currentFuel - fuelConsumption;
                if(currentFuel<= 0) {
                    currentFuel=0;
                    System.out.println(String.format("The %s's tank has %s gallons. It can't go any further!", this.getName(), currentFuel));
                    return;
                }
                System.out.println(String.format("The %s's tank has %s gallons of fuel in it", this.getName(), currentFuel));
            }
        }
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        active();
    }
}
