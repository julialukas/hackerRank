package org.parkingLot;

public class ParkingSpot {
    private boolean free;
    private SpotType type;

    public ParkingSpot(boolean free, SpotType type){
        this.free=free;
        this.type=type;

    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public SpotType getType() {
        return type;
    }

    public void setType(SpotType type) {
        this.type = type;
    }

}
