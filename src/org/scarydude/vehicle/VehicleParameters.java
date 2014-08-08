package org.scarydude.vehicle;

public class VehicleParameters {
    private String speed;
    private String weight;
    private String name;

    public VehicleParameters() {}

    public VehicleParameters(String name) {
        this.name = name;
    }

    public VehicleParameters(String speed, String weight, String name) {
        this.speed = speed;
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
