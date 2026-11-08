package low_level_design.ParkingLot.factory;

import low_level_design.ParkingLot.enums.VehicleType;
import low_level_design.ParkingLot.strategy.pricing.CarPricingStrategy;
import low_level_design.ParkingLot.strategy.pricing.MotorBikePricingStrategy;
import low_level_design.ParkingLot.strategy.pricing.PricingStrategy;

public class PricingStrategyFactory {

    public PricingStrategyFactory() {
    }

    public static PricingStrategy getStrategy(VehicleType type) {
        return switch (type) {
            case CAR -> new CarPricingStrategy();
            case MOTORBIKE -> new MotorBikePricingStrategy();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
    }
}
