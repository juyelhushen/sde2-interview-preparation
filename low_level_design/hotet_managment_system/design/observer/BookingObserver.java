package low_level_design.hotet_managment_system.design.observer;

import low_level_design.hotet_managment_system.entity.Booking;

public interface BookingObserver {
    void onBookingConfirmed(Booking booking);
    void onBookingCancelled(Booking booking);
}


