package low_level_design.online_shopping_cart.design.strategy;

import low_level_design.online_shopping_cart.entity.Cart;

public interface DiscountStrategy {
    double calculateDiscount(Cart cart);
}
