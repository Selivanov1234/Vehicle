package java2.vehicle;

import java2.station.FillingStation;

import java.util.concurrent.TimeUnit;

public class Vehicle implements Runnable {
    private String name;
    private float currentFuel;
    private float maxFuel;
    private float fuelConsumption;
    private float critLevel;
    private FillingStation fillingStation;

    public Vehicle(String name, float maxFuel, float fuelConsumption, FillingStation fillingStation) {
        this.name = name;
        this.maxFuel = maxFuel;
        this.fuelConsumption = fuelConsumption;
        this.fillingStation = fillingStation;
        currentFuel = maxFuel;
        critLevel = fuelConsumption * 2;
    }

    public void active() {
        System.out.println(String.format("The %s is on the road", this.getName()));
        System.out.println(String.format("The %s's tank has %s gallons of fuel in it", this.getName(), currentFuel));
        for (float i = fuelConsumption; currentFuel != 0; ) {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentFuel = currentFuel - fuelConsumption;

            if(currentFuel<=critLevel) {
                System.out.println(String.format("The %s's tank has %s gallons. Filling is needed. Heading to the filling station.", this.getName(), currentFuel));
                float refuel = fillingStation.refuel(maxFuel - currentFuel);
                currentFuel += refuel;
            }
            if(currentFuel<= 0) {
                currentFuel=0;
                System.out.println(String.format("The %s's tank has %s gallons. It can't go any further!", this.getName(), currentFuel));
                return;
            }
            System.out.println(String.format("The %s's tank has %s gallons of fuel in it", this.getName(), currentFuel));
            active();
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