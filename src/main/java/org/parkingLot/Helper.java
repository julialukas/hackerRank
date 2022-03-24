package org.parkingLot;

public class Helper {
    public SpotType getSpotTypeByVehicleType(VehicleType type) {
        switch (type) {
            case CAR:
                return SpotType.MEDIUM;
            case VAN:
                return SpotType.LARGE;
            case BIKE:
                return SpotType.SMALL;
            default:
                System.out.println("This vehicle can not be parked ");
                return null;
        }
    }
}
