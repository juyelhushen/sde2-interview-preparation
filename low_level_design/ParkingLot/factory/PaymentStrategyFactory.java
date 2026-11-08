package low_level_design.ParkingLot.factory;

import low_level_design.ParkingLot.enums.PaymentMode;
import low_level_design.ParkingLot.strategy.payment.CardPaymentStrategy;
import low_level_design.ParkingLot.strategy.payment.CashPaymentStrategy;
import low_level_design.ParkingLot.strategy.payment.PaymentStrategy;
import low_level_design.ParkingLot.strategy.payment.UPIPaymentStrategy;

public class PaymentStrategyFactory {

    public PaymentStrategyFactory() {
    }

    public static PaymentStrategy getStrategy(PaymentMode mode) {
        return switch (mode) {
            case UPI -> new UPIPaymentStrategy();
            case CARD -> new CardPaymentStrategy();
            case CASH -> new CashPaymentStrategy();
            default -> throw new IllegalArgumentException("Unknown Payment Mode");
        };
    }

}
