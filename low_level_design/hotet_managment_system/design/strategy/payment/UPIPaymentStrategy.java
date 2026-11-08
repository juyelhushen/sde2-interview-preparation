package low_level_design.hotet_managment_system.design.strategy.payment;

import low_level_design.ParkingLot.strategy.payment.PaymentStrategy;

public class UPIPaymentStrategy implements PaymentStrategy {
    public static final UPIPaymentStrategy INSTANCE = new UPIPaymentStrategy();

    public UPIPaymentStrategy() {
    }

    @Override
    public boolean pay(double amount) {
        System.out.printf(" [Payment] Rs.%.2f paid via UPI.%n", amount);
        return true;
    }
}
