package org.parkingLot;

import java.util.List;

public abstract class Vehicle {
    private VehicleType type;
public Vehicle(VehicleType type){
    this.type=type;
}
public abstract void park(VehicleType vehicle);
public abstract void removeVehicle(VehicleType vehicleType);
public abstract int countVehicles(VehicleType vehicleType);



}
