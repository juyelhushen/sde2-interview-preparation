package low_level_design.ParkingLot.exception;

public class NoSpotAvailableException extends RuntimeException {

    public NoSpotAvailableException(String message) {
        super(message);
    }
}
