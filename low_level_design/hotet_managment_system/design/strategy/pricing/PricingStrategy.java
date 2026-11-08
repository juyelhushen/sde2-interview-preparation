package low_level_design.hotet_managment_system.design.strategy.pricing;

import low_level_design.hotet_managment_system.entity.Room;

import java.time.LocalDate;

public interface PricingStrategy {

    // per-night rate for a specific room on a specific date —
    // allows different rates for weekdays vs weekends vs peak season
    double pricePerNight(Room room, LocalDate date);

}
