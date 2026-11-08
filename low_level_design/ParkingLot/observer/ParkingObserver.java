package low_level_design.ParkingLot.observer;

import low_level_design.ParkingLot.entity.ParkingFloor;
import low_level_design.ParkingLot.enums.SpotType;

public interface ParkingObserver {
    void onSpotStatusChanged(ParkingFloor floor, SpotType type);
}
