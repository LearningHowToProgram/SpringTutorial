package org.scarydude.vehicle.cars;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;
import org.scarydude.vehicle.Vehicle;
import org.scarydude.vehicle.VehicleParameters;
import org.scarydude.vehicle.exceptions.VehicleIsStoppedException;

public class Cars implements Vehicle {

    private String speed;
    private String weight;
    private String name;

    public Cars() {
    }

    public Cars(String name) {
        this.name = name;
    }

    public Cars(String speed, String weight, String name) {
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


    @Override
    public Boolean ride(Integer speed) {
        System.out.println("I'm riding");
        return speed > 0;
    }

    /*
    * Count time of stop
    **/
    @Override
    public Double stop() throws VehicleIsStoppedException {
        if (Integer.valueOf(speed) == 0) {
            throw new VehicleIsStoppedException("Car is not moving");
        } else if (Integer.valueOf(speed) < 0) {
            throw new VehicleIsStoppedException(Integer.valueOf(speed));
        }
        return countTime();
    }

    private Double countTime() {
        return Double.valueOf(weight) *
                Integer.parseInt(speed);
    }
}
