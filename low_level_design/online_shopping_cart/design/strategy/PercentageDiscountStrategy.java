package low_level_design.online_shopping_cart.design.strategy;

import low_level_design.online_shopping_cart.entity.Cart;

public class PercentageDiscountStrategy implements DiscountStrategy{
    private final int percentage;

    public PercentageDiscountStrategy(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(Cart cart) {
        return cart.getSubTotalAmount() * (percentage / 100.0);
    }
}
