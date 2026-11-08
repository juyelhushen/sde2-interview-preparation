package low_level_design.hotet_managment_system.design.singleton;

import low_level_design.hotet_managment_system.design.observer.EmailNotificationObserver;
import low_level_design.hotet_managment_system.design.observer.SMSNotificationObserver;
import low_level_design.hotet_managment_system.repository.*;
import low_level_design.hotet_managment_system.service.HotelBookingService;
import low_level_design.hotet_managment_system.service.HotelBookingServiceImpl;
import low_level_design.hotet_managment_system.service.SearchService;

public final class HotelBookingSystem {

    // Initialization-on-demand holder — lazy, thread-safe, zero synchronized overhead.
    // Same reasoning as Library and low_level_design.ParkingLot: one source of truth for booking state.
    private static class Holder {
        private static final HotelBookingSystem INSTANCE = new HotelBookingSystem();
    }

    public static HotelBookingSystem getInstance() {
        return Holder.INSTANCE;
    }

    private final UserRepository userRepo = new UserRepository();
    private final HotelRepository hotelRepo = new HotelRepository();
    private final RoomRepository roomRepo = new RoomRepository();
    private final BookingRepository bookingRepo = new BookingRepository();
    private final PaymentRepository paymentRepo = new PaymentRepository();

    private final SearchService searchService =
            new SearchService(hotelRepo, bookingRepo);

    private final HotelBookingServiceImpl bookingService;

    private HotelBookingSystem() {
        bookingService = new HotelBookingServiceImpl(
                hotelRepo, userRepo, roomRepo, bookingRepo, paymentRepo, searchService);

        // wire observers once at startup — service fires them, never knows which ones
        bookingService.registerObserver(new EmailNotificationObserver());
        bookingService.registerObserver(new SMSNotificationObserver());
    }

    public HotelBookingService getBookingService() {
        return bookingService;
    }

    public UserRepository getUserRepository() {
        return userRepo;
    }

}
