package low_level_design.hotet_managment_system.design.state.booking;

import low_level_design.hotet_managment_system.entity.Booking;
import low_level_design.hotet_managment_system.enums.BookingStatus;
import low_level_design.hotet_managment_system.exception.InvalidBookingStateException;

public class CancelledBookingState implements BookingState {


    @Override
    public void confirm(Booking booking) {
        throw new InvalidBookingStateException("Booking is Cancelled");
    }

    @Override
    public void cancel(Booking booking) {
        throw new InvalidBookingStateException("Booking Already Cancelled");
    }

    @Override
    public void complete(Booking booking) {
        throw new InvalidBookingStateException("Booking is Cancelled");
    }

    @Override
    public BookingStatus getStatus() {
        return BookingStatus.CANCELLED;
    }
}
