package low_level_design.ParkingLot.entity;

import low_level_design.ParkingLot.enums.SpotType;

public class CarSpot extends ParkingSpot {

    public CarSpot(String spotId, String floorId) {
        super(spotId, floorId, SpotType.COMPACT);
    }
}
