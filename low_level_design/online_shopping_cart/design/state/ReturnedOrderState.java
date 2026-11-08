package low_level_design.online_shopping_cart.design.state;

import low_level_design.online_shopping_cart.entity.Order;
import low_level_design.online_shopping_cart.enums.OrderStatus;
import low_level_design.online_shopping_cart.exceptions.InvalidOrderException;

public class ReturnedOrderState implements OrderState {

    @Override
    public void confirm(Order order) {
        throw new InvalidOrderException("Order is already returned.");
    }

    @Override
    public void ship(Order order) {
        throw new InvalidOrderException("Cannot ship an order that is already returned.");

    }

    @Override
    public void deliver(Order order) {
        throw new InvalidOrderException("Cannot deliver an order that is already returned.");
    }

    @Override
    public void cancel(Order order) {
        throw new InvalidOrderException("Cannot cancel an order that is already returned.");
    }

    @Override
    public void returnOrder(Order order) {
        throw new InvalidOrderException("Order is already returned.");
    }

    @Override
    public OrderStatus getStatus() {
        return OrderStatus.RETURNED;
    }
}
