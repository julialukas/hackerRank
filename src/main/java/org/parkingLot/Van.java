package org.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Van extends Vehicle {
    List<VehicleType> vans =  new ArrayList<>();
    public Van(VehicleType type){
        super(VehicleType.VAN);
    }

    @Override
    public void park(VehicleType vehicle) {
        vans.add(vehicle);
    }

    @Override
    public void removeVehicle(VehicleType vehicleType) {
        if(vans.size()>0){
            vans.remove(VehicleType.VAN);
        }else{
            System.out.println("There is no Vans to remove in the parking lot ");
        }
    }

    @Override
    public int countVehicles(VehicleType vehicleType) {
        return vans.size();
    }



}
