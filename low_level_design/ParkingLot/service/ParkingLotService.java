package low_level_design.ParkingLot.service;

import low_level_design.ParkingLot.entity.ParkingTicket;
import low_level_design.ParkingLot.entity.Payment;
import low_level_design.ParkingLot.entity.Vehicle;
import low_level_design.ParkingLot.enums.PaymentMode;

// The entire public API of the lot, deliberately kept to two operations -
// a real parking lot only ever does two things: let a vehicle in, let a
// vehicle out. Pricing, payment, which spot, which floor - all of that
// is an implementation detail hidden behind these two methods.

public interface ParkingLotService {
    ParkingTicket parkVehicle(Vehicle vehicle);

    Payment unparkVehicle(String ticketId, PaymentMode mode);
}