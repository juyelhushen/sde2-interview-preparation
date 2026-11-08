package low_level_design.ParkingLot.factory;

import low_level_design.ParkingLot.entity.CarSpot;
import low_level_design.ParkingLot.entity.MotoBikeSpot;
import low_level_design.ParkingLot.entity.ParkingSpot;
import low_level_design.ParkingLot.enums.SpotType;

public final class ParkingSpotFactory {
    private static final int DEFAULT_CHARGING_POWER_KW = 7;

    private ParkingSpotFactory() {
    }

    public static ParkingSpot create(SpotType type, String spotId, String floorId) {
        return switch (type) {
            case COMPACT -> new CarSpot(spotId, floorId);
            case MOTORBIKE -> new MotoBikeSpot(spotId, floorId);
        };
    }
}