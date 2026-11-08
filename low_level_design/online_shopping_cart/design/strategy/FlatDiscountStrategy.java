package low_level_design.online_shopping_cart.design.strategy;

import low_level_design.online_shopping_cart.entity.Cart;

public class FlatDiscountStrategy implements DiscountStrategy {

    private final double flatDiscountAmount;

    public FlatDiscountStrategy(double flatDiscountAmount) {
        this.flatDiscountAmount = flatDiscountAmount;
    }

    @Override
    public double calculateDiscount(Cart cart) {
        return Math.min(flatDiscountAmount, cart.getSubTotalAmount());
    }
}
