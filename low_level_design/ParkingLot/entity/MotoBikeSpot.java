package low_level_design.ParkingLot.entity;

import low_level_design.ParkingLot.enums.SpotType;

public class MotoBikeSpot extends ParkingSpot {

    public MotoBikeSpot(String spotId, String floorId) {
        super(spotId, floorId, SpotType.MOTORBIKE);
    }
}
