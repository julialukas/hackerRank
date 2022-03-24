package org.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle{
    List<VehicleType>bikes=new ArrayList<>();
    private ParkingLot parkingLot;


    public Bike(){
        super(VehicleType.BIKE);
    }

    @Override
    public void park(VehicleType vehicle) {

    }

    @Override
    public void removeVehicle(VehicleType vehicleType) {
        if(bikes.size()>0){
            bikes.remove(VehicleType.BIKE);
        }else{
            System.out.println("There is no Bikes to remove in the parking lot ");
        }
    }

    @Override
    public int countVehicles(VehicleType vehicleType) {

        return bikes.size();
    }

}
