package org.scarydude.main;

import org.scarydude.vehicle.Vehicle;
import org.scarydude.vehicle.cars.Cars;
import org.scarydude.collection.ArrayListTest;
import org.scarydude.collection.HashMapTest;
import org.scarydude.vehicle.exceptions.VehicleIsStoppedException;
import org.scarydude.vehicle.motocycles.Motocycles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Vehicle supra = new Cars("Supra");
        Vehicle mustang = new Cars("Mustang");
        Vehicle chrysler = new Cars("Billy");
        Vehicle bmw = new Cars("Fritz");

        setParameters(supra, "120", "1500.19");
        setParameters(mustang, "100", "2045.25");
        setParameters(chrysler, "20", "1865.95");
        setParameters(bmw, "89", "1790.43");

        putInMap(supra);
        putInMap(mustang);
        putInMap(chrysler);
        putInMap(bmw);

        System.out.println(cars.get("Fritz") + "ms");



    }

    static Map<String, Object> cars = new HashMap<String, Object>();

    static void putInMap(Vehicle transport) {
        Cars c = (Cars) transport;
        try {
            cars.put(c.getName(), c.stop());
        } catch (VehicleIsStoppedException e) {
            e.getStackTrace();
        }
    }

    static void setParameters(Vehicle car, String speed, String weight) {
        Cars c = (Cars) car;
        c.setSpeed(speed);
        c.setWeight(weight);
    }

    static Vehicle func(Vehicle transport) {
        return (Cars) transport;
    }



}
