package low_level_design.hotet_managment_system.design.factory;

import low_level_design.hotet_managment_system.design.strategy.payment.CreditCardPaymentStrategy;
import low_level_design.hotet_managment_system.design.strategy.payment.PaymentStrategy;
import low_level_design.hotet_managment_system.design.strategy.payment.UPIPaymentStrategy;
import low_level_design.hotet_managment_system.design.strategy.payment.WalletPaymentStrategy;
import low_level_design.hotet_managment_system.enums.PaymentMode;

public class PaymentStrategyFactory {

    private PaymentStrategyFactory() {
    }

    public PaymentStrategy paymentStrategy(PaymentMode mode) {
        return (PaymentStrategy) switch (mode) {
            case CARD -> CreditCardPaymentStrategy.INSTANCE;
            case UPI -> UPIPaymentStrategy.INSTANCE;
            case WALLET -> WalletPaymentStrategy.INSTANCE;
        };
    }
}
