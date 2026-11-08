package low_level_design.hotet_managment_system.design.state.booking;

import low_level_design.hotet_managment_system.entity.Booking;
import low_level_design.hotet_managment_system.enums.BookingStatus;

public interface BookingState {
    void confirm(Booking booking);
    void cancel(Booking booking);
    void complete(Booking booking);
    BookingStatus getStatus();
}
