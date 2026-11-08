package low_level_design.ParkingLot.observer;

import low_level_design.ParkingLot.entity.ParkingFloor;
import low_level_design.ParkingLot.enums.SpotType;

public class DisplayBoard implements ParkingObserver {

    @Override
    public void onSpotStatusChanged(ParkingFloor floor, SpotType type) {
        System.out.println("status changes here");
    }
}
