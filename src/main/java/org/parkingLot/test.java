package org.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ParkingSpot sp = new ParkingSpot(true, SpotType.LARGE);
            ParkingSpot sp2 = new ParkingSpot(true, SpotType.MEDIUM);
            ParkingSpot sp3 = new ParkingSpot(true, SpotType.SMALL);

            spots.add(sp);
            spots.add(sp2);
            spots.add(sp3);
        }
        System.out.println(spots.size());
        ParkingLot lot = new ParkingLot(spots);
        lot.getSpots(SpotType.LARGE);
        lot.parkVehicle(VehicleType.CAR);
        lot.parkVehicle(VehicleType.VAN);
        lot.parkVehicle(VehicleType.BIKE);
        lot.parkVehicle(VehicleType.CAR);
        lot.getSpots(SpotType.SMALL);
        lot.empTySpace(VehicleType.CAR);

        System.out.println("Calc ");
        System.out.println(1000%100);

    }
}
