package org.parkingLot;

import java.util.List;

public  class ParkingLot {
    private int spotsCount;
    private int freeSpots;
    private int occupied;
    private List<ParkingSpot>spots;
    private List<VehicleType>vehicles;


/*
Create a parking lot add empty and occupied spaces
 */
    public ParkingLot(List<ParkingSpot>spots){
        this.spots=spots;
        this.spotsCount=spots.size();

    }

    public void occupySpot(SpotType type){

            for (ParkingSpot p:spots) {
                if(p.getType().equals(type) && p.isFree()){
                    p.setFree(false);
                }
            }

    }
    public void freeSpot(SpotType type){

        for (ParkingSpot p:spots) {
            if(p.getType().equals(type) && !p.isFree()){
                p.setFree(true);
            }
        }

    }
    public int getSpots(SpotType spotType){

        if(spots.size()>0){
            for (int i = 0; i <spots.size() ; i++) {
                if(spots.get(i).getType().equals(spotType)){
                    spotsCount++;
                }
            }
        }
        System.out.println(spotsCount);
        return spotsCount;
    }
    public int countFreeSpots(SpotType spotType){

       if(spots.size()>0){
           for (int i = 0; i < spots.size(); i++) {
               if(spots.get(i).getType().equals(spotType) && spots.get(i).isFree() ){
                   freeSpots++;
               }

           }
       }
        System.out.println(freeSpots);
        return freeSpots;
    }
    public int countTakenSpots(SpotType spotType){

        if(spots.size()>0){
            for (int i = 0; i < spots.size(); i++) {
                if(spots.get(i).getType().equals(spotType) && !spots.get(i).isFree() ){
                    occupied++;
                }

            }
        }
        System.out.println(occupied);
        return occupied;
    }

public void parkVehicle(VehicleType vehicle){
    Helper helper = new Helper();
  this.occupySpot(helper.getSpotTypeByVehicleType(vehicle));


}

    public void empTySpace(VehicleType vehicle){
        Helper helper = new Helper();
        System.out.println("Removing hehicle from this spot ");
        this.freeSpot(helper.getSpotTypeByVehicleType(vehicle));

    }

}
