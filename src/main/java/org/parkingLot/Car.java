package org.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    List<VehicleType>cars=new ArrayList<>();
    public Car(){
        super(VehicleType.CAR);
        System.out.println();

    }

    @Override
    public void park(VehicleType vehicle) {
        cars.add(vehicle);
    }

    @Override
    public void removeVehicle(VehicleType vehicleType) {

    }

    @Override
    public int countVehicles(VehicleType vehicleType) {
        return cars.size();
    }



}
