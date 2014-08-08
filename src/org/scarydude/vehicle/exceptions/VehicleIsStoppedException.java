package org.scarydude.vehicle.exceptions;

public class VehicleIsStoppedException extends Exception {
    public VehicleIsStoppedException() {
        System.out.println("There is some VehicleIsStoppedException");
    }

    public VehicleIsStoppedException(String message) {
        System.out.println(message);
    }

    public VehicleIsStoppedException(Integer speed) {
        System.out.println("Speed values can not be " + speed);
    }
}
