package low_level_design.online_shopping_cart.exceptions;

public class InvalidOrderException extends RuntimeException{
    public InvalidOrderException(String message) {
        super(message);
    }
}
