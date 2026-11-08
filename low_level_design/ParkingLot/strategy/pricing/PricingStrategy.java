package low_level_design.ParkingLot.strategy.pricing;

import low_level_design.ParkingLot.entity.ParkingTicket;

public interface PricingStrategy {

    double calculateFee(ParkingTicket ticket);

}
