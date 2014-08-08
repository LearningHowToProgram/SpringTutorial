package org.scarydude.vehicle.motocycles;


import org.scarydude.vehicle.Vehicle;
import org.scarydude.vehicle.exceptions.VehicleIsStoppedException;

public class Motocycles implements Vehicle {

    private String speed;
    private String weight;
    private String name;

    public Motocycles() {}

    public Motocycles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Motocycles(String speed, String weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public Boolean ride(Integer speed) {
        System.out.println("I'm riding");
        return speed > 0;
    }

    @Override
    public Double stop() throws VehicleIsStoppedException {
        if (Integer.valueOf(speed) <= 0) {
            throw new VehicleIsStoppedException("Car is stopped");
        }
        return countTime();
    }

    private Double countTime() {
        return Double.valueOf(weight) *
                Integer.parseInt(speed);
    }
}