package low_level_design.online_shopping_cart.design.state;

import low_level_design.online_shopping_cart.entity.Order;
import low_level_design.online_shopping_cart.enums.OrderStatus;

public interface OrderState {
    void confirm(Order order);
    void ship(Order order);
    void deliver(Order order);
    void cancel(Order order);
    void returnOrder(Order order); // Renamed from return() to returnOrder() to avoid conflict with Java's reserved keyword
    OrderStatus getStatus();
}
