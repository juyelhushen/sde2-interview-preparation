package low_level_design.online_shopping_cart.design.factory;

import low_level_design.online_shopping_cart.design.strategy.DiscountStrategy;
import low_level_design.online_shopping_cart.design.strategy.FlatDiscountStrategy;
import low_level_design.online_shopping_cart.design.strategy.PercentageDiscountStrategy;
import low_level_design.online_shopping_cart.entity.Coupon;

public final class DiscountStrategyFactory {

    private DiscountStrategyFactory() {
        // private constructor to prevent instantiation
    }

    public static DiscountStrategy getFactory(Coupon coupon) {
        return switch (coupon.getType()) {
            case PERCENTAGE -> new PercentageDiscountStrategy((int) coupon.getValue());
            case FLAT -> new FlatDiscountStrategy(coupon.getValue());
        };
    }
}
