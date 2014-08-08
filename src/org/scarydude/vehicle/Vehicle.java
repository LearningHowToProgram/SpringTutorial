package org.scarydude.vehicle;


import org.scarydude.vehicle.exceptions.VehicleIsStoppedException;

public interface Vehicle {
    Boolean ride(Integer speed);
    Double stop() throws VehicleIsStoppedException;
}
