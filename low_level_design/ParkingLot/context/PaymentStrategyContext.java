package low_level_design.ParkingLot.context;

import low_level_design.ParkingLot.entity.Payment;
import low_level_design.ParkingLot.enums.PaymentMode;
import low_level_design.ParkingLot.strategy.payment.PaymentStrategy;

public class PaymentStrategyContext {

    private PaymentStrategy paymentStrategy;


    public PaymentStrategyContext() {
    }

    public PaymentStrategyContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Payment processPayment(String ticketId, double amount, PaymentMode mode) {
        Payment payment = new Payment(ticketId, amount, mode);
        boolean success = paymentStrategy.pay(amount);

        if (success) payment.markCompleted();
        else payment.markFailed();

        return payment;
    }
}
